package TestSoap;

import org.apache.cxf.frontend.ServerFactoryBean;

public class HelloServer {
    protected HelloServer() throws Exception {
        ServerFactoryBean factory = new ServerFactoryBean(); //Сервер использует класс ServerFactoryBean, предоставляемый библиотеками CXF, для предоставления нашего интерфейса HelloWorld удаленным клиентам
        factory.setServiceClass(HelloWorld.class); //устанавливаем класс сервиса
        factory.setAddress("http://localhost:5000/Hello"); //устанавливаем URL для вызова нашего сервиса
        factory.setServiceBean(new HelloWorldImpl()); //классе реализации нашего сервиса
        factory.create(); // создаем фабрику
    }
    public static void main(String[] args) throws Exception {
        new HelloServer();
        System.out.println("Listening on port 5000 ...");
        Thread.sleep(5 * 60 * 1000); //5 минут
        System.out.println("Server exiting ...");
        System.exit(0);
    }
}
