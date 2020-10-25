import org.hibernate.Session;

import br.com.carro.util.HibernateUtil;

public class Teste {

	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
		
		

	}

}
