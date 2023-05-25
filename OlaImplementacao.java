import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OlaImplementacao extends UnicastRemoteObject implements Ola{

	protected OlaImplementacao() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String digaOla() throws RemoteException {
		return "Ola, mundo. Esta sendo executado pelo RMI";
	}

}
