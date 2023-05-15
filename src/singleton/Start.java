package singleton;

public class Start {
    public static void main(String[] args) {
        ConnectionPool singleton = ConnectionPool.getInstance();

        singleton.listConnections();
        System.out.println("--------------");
        try {
            Connection activeConnection = singleton.getActiveConnection();
//            Connection active2Connection = singleton.getActiveConnection();
//            Connection activ3Connection = singleton.getActiveConnection();
//            Connection activ4Connection = singleton.getActiveConnection();

            System.out.println(activeConnection.id);
            System.out.println("--------------");
            singleton.listConnections();
            System.out.println("--------------");
            singleton.closeConnection(activeConnection);
            singleton.listConnections();
        } catch (BusinessException businessException){
            System.out.println(businessException.getMessage());
        }


    }
}
