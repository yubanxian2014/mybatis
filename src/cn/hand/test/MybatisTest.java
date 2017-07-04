package cn.hand.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisTest {

	@Test
	public void test1() throws IOException
	{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession sqlSession=factory.openSession();
//		Users user=sqlSession.selectOne("test.findByUserId", 1);
//		System.out.println(user);
		sqlSession.close();
	}
}
