package org.sreekanth.Flipkart;

import org.sreekanth.Flipkart.entity.ProductEntity;
import org.sreekanth.Flipkart.repository.FlipkartRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        FlipkartRepository repository = new FlipkartRepository();
        ProductEntity entity = new ProductEntity();
        entity.setName("Mobile");
        entity.setProductType("Electrical");
        entity.setPrice("120000");
        entity.setDescription("It is a Good Product");
        entity.setManufactureDate("1999-10-12");
        
        repository.saveProductDetails(entity);
        
    }
}
