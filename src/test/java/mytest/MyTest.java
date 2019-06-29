//package mytest;
//
//
//import com.wjj.bean.Role;
//import com.wjj.bean.RoleExample;
//import com.wjj.mapper.RoleMapper;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//public class MyTest {
//
//
//    private InputStream is;
//    private SqlSession session;
//    private RoleMapper roleMapper;
//
//    @Before
//    public void init() throws IOException {
//        is = Resources.getResourceAsStream("Mybatis-Config.xml");
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        session = factory.openSession();
//        roleMapper = session.getMapper(RoleMapper.class);
//
//    }
//    @After
//    public void destory() throws IOException {
//        session.commit();
//        is.close();
//        session.close();
//    }
//
//    @Test
//    public void test(){
//        RoleExample roleExample = new RoleExample();
//        RoleExample.Criteria criteria = roleExample.createCriteria();
//        criteria.andRoleDescLike("%管理%").andIdBetween(1,2);
//        List<Role> roles = roleMapper.selectByExample(roleExample);
//        long l = roleMapper.countByExample(roleExample);
//        System.out.println(roles);
//
//    }
//
//
//}
