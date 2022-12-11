import java.net.MalformedURLException;
import java.rmi.*;

public class ClientRMI {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {


        Remote rr=Naming.lookup("rmi://localhost/riad");
        https://github.com/riadelhajjaji/rmi.git
        System.out.println(rr);


}}
