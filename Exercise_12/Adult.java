import java.lang.reflect.*;

public class Adult implements InvocationHandler {
    Remote remote;

    public Adult(Remote remote) {
        this.remote = remote;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
        throws IllegalAccessException {

    try { 
        if (method.getName().startsWith("volume")) {
            return method.invoke(remote, args);
        } else if(method.getName().startsWith("channel")) { 
            return method.invoke(remote, args);
        }
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    }
        return null; 
    }
}
