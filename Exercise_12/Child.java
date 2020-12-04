import java.lang.reflect.*;

public class Child implements InvocationHandler {
    Remote remote;

    public Child(Remote remote) {
        this.remote = remote;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
        throws IllegalAccessException {

        try { 
            if (method.getName().startsWith("volume")) {
                return method.invoke(remote, args);
            }   else if(method.getName().startsWith("channel")) { 
                throw new IllegalAccessException();
            }
        }  catch (InvocationTargetException e) {
        e.printStackTrace();
    }
    return null;
    }
}