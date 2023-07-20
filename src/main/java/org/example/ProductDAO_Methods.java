package org.example;

import org.example.ProductDAO;
import org.example.ProductDAOImpl;

public class ProductDAO_Methods {
    public static ProductDAO pd = null;

    public static  ProductDAO getProductDAOMethods(){
        if(pd==null)
        {
            pd = new ProductDAOImpl();
        }
        return pd;
    }
}
