/**
	Remote interface. Defines the function getData
	That gets data from the client and Server echos the input
**/
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Daniel Mutwiri
 */
public interface RMI extends Remote{
    public String getData(String text) throws RemoteException;
}
