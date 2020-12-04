import java.lang.reflect.*;

public class main {

    public static void main(String[] args) {

        Remote adultRemote = new RemoteImp();
        Remote adultProxy = getAdultProxy(adultRemote);
        Remote childRemote = new RemoteImp();
        Remote childProxy = getChildProxy(childRemote);

        adultProxy.channelUp();
        adultProxy.channelUp();
        adultProxy.channelDown();

        adultProxy.volumeUp();
        adultProxy.volumeUp();
        adultProxy.volumeUp();
        adultProxy.volumeDown();

        childProxy.volumeUp();
        childProxy.volumeUp();
        childProxy.volumeDown();

        childProxy.channelDown();
        childProxy.channelUp();

    }
    static Remote getAdultProxy(Remote remote) {
        
        return (Remote) Proxy.newProxyInstance(
        remote.getClass().getClassLoader(),
        remote.getClass().getInterfaces(),
        new Adult(remote));
    }
    static Remote getChildProxy(Remote remote) {
        
        return (Remote) Proxy.newProxyInstance(
        remote.getClass().getClassLoader(),
        remote.getClass().getInterfaces(),
        new Child(remote));
    }
}
