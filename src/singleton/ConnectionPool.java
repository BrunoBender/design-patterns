package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Singleton class
public class ConnectionPool {

    static ConnectionPool singleton = new ConnectionPool();
    static final int qtdConnections = 3;
    List<Connection> connectionList;

    //Somente a própria classe pode usar o construtor
    private ConnectionPool(){
        System.out.println("Criando ConnectionPool");
        connectionList = new ArrayList<>();

        for (int i = 0; i < this.qtdConnections; i++) {
            connectionList.add(new Connection(i, false));
        }
    }

    static ConnectionPool getInstance(){
        return singleton;
    }

    public Connection getActiveConnection() throws BusinessException{
        Optional<Connection> activeConnectionOp = connectionList.stream()
                .filter(connection -> !connection.inUse)
                .findFirst();

        if(activeConnectionOp.isEmpty()){
            throw new BusinessException("Nenhuma conexão disponível no momento");
        }

        activeConnectionOp.get().inUse = true;

        return activeConnectionOp.get();
    }

    public void closeConnection(Connection activeConnection){
        activeConnection.inUse = false;
    }

    public void listConnections(){
        connectionList.forEach(connection -> System.out.println(connection.id+ " -> "+ connection.inUse));
    }
}
