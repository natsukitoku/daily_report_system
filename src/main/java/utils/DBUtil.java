package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import constants.JpaConst;

public class DBUtil {

	private static EntityManagerFactory emf;

	//EntityManagerインスタンス生成
	public static EntityManager createEntityManager() {
		return _getEntityManagerFactory().createEntityManager();

	}

	//EntityManagerFactoryインスタンスを生成
	public static EntityManagerFactory _getEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(JpaConst.PERSISTENCE_UNIT_NAME);
		}

		return emf;
	}

}
