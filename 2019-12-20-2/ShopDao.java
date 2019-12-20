//Dao 连接数据库中的shop表
import bean.Shop;

import java.sql.*;
import java.util.HashMap;

public class ShopDao {
    public HashMap getAllShop() throws Exception {
        Statement stat = null;
        ResultSet rs = null;

        ConnDao connDao = new ConnDao();
        connDao.connection();

        HashMap hm = new HashMap();
        stat = connDao.conn.createStatement();
        String sql = "select * from goods";
        rs = stat.executeQuery(sql);
        while (rs.next()){
            Shop shop = new Shop();
            //将从数据库中查询的数据放入商品对象中
            shop.setSid(rs.getString("sId"));
            shop.setName(rs.getString("sName"));
            shop.setSprice(rs.getInt("sPrice"));
            //以商品的id为键，以商品对象为值
            hm.put(shop.getSid(),shop);
        }
        rs.close();
        stat.close();
        connDao.conn.close();
        return hm;
    }
}