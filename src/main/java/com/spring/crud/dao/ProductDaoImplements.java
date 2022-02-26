package com.spring.crud.dao;

import com.spring.crud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDaoImplements implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // insert product
    @Transactional
    public void insertProduct(Product product) {
        this.getHibernateTemplate().saveOrUpdate(product);
    }

    // get all product
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<Product>();
        products = this.getHibernateTemplate().loadAll(Product.class);
        return products;
    }

    // delete the single product
    @Transactional
    public void deleteSingleProduct(int pid) {
        Product product = this.getHibernateTemplate().load(Product.class, pid);
        this.getHibernateTemplate().delete(product);
    }

    // delete the single product
    public Product getSingleProduct(int pid) {
        return this.getHibernateTemplate().get(Product.class, pid);
    }


}
