package java_project;


public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[]picture;
    
    public Product(int productID, String productNAME, float productPRICE, String productAddDate, byte[] productIMG){
        this.id = productID;
        this.name = productNAME;
        this.price = productPRICE;
        this.addDate = productAddDate;
        this.picture = productIMG;     
        
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return  addDate;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
} 
    
