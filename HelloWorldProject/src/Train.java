//Kaysan Antoni pd3 Adams
public class Train {
    private String name, product, origin, destination;
    private int weight, miles;


    public Train ( String n, String p, String o, String d, int w, int m){

   
        n=name;
        p=product;
        o=origin;
        d=destination;
        w=weight;
        m=miles;

    }

    public Train ( String n, String d){
        n=name;
        d=destination;
    }

    public String getName(){
        return name;
    }
    public String getProduct(){
        return product;
    }
    public String getOrigin(){
        return origin;
    }
    public String getDestination(){
        return destination;
    }
    public int getWeight(){
        return weight;
    }
    public int getMiles(){
        return miles;
    }


    public String toString(){
        return(name+" leaving for "+ destination+ " with the following cars: ");
    }

    


}
