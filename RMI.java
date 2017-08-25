import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI extends Remote{
//public String getData(String text) throws RemoteException;

public void increngkfp(int n3) throws RemoteException;
public void increngjb(int n4) throws RemoteException;
public void incrhinkk(int n1) throws RemoteException;
public void incrhinks(int n2) throws RemoteException;
public int getkkData() throws RemoteException; 
public int getksData() throws RemoteException;
public int getkfpData() throws RemoteException;
public int getjbData() throws RemoteException;
public int getckkData(int n5) throws RemoteException;
public int getcksData(int n6) throws RemoteException;
public int getckfpData(int n7) throws RemoteException;
public int getcjbData(int n8) throws RemoteException;
}
