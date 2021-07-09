package TestSoap;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
public class HelloClient {
    public static void main(String[] args) throws Exception {
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean(); //создаем экземпляр фабричного компонента
        factory.setAddress("http://localhost:5000/Hello");
        HelloWorld helloServer = factory.create(HelloWorld.class);
        System.out.println(helloServer.greetings("Alexandr")); //вызываем метод приветствия для вызова удаленного веб-сервиса.
    }
}