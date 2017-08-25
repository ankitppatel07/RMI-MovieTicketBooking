import java.io.*;	
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RMI{

int kfp,jb,kk,ks;

public RMIServer() throws RemoteException{
        super();
    }

public void increngkfp(int n3) throws RemoteException {kfp=kfp+n3;}     
public void increngjb(int n4) throws RemoteException {jb=jb+n4;}  
public void incrhinkk(int n1) throws RemoteException {kk=kk+n1;}     
public void incrhinks(int n2) throws RemoteException {ks=ks+n2;}       
public int getkkData() throws RemoteException {return kk;} 
public int getksData() throws RemoteException {return ks;}
public int getkfpData() throws RemoteException {return kfp;}
public int getjbData() throws RemoteException {return jb;}
public int getckkData(int n5) throws RemoteException {return kk=kk-n5;}
public int getcksData(int n6) throws RemoteException {return ks=ks-n6;}
public int getckfpData(int n7) throws RemoteException {return kfp=kfp-n7;}
public int getcjbData(int n8) throws RemoteException {return jb=jb-n8;}

    public static void main(String args[]){
        try{
            Registry reg = LocateRegistry.createRegistry(8081);
            reg.rebind("server", new RMIServer());
            System.out.println("Server started");
      }
    
        catch(Exception e){
            System.out.println(e);
        }
}
}
