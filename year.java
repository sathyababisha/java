class parents
{
    public void title()
    {
        System.out.println("age of my parents");
    }
}
class age extends parents
{
    public void page()
    {
        System.out.println("my father has 50 years");
        System.out.println("my mother has 45 years");
    }
}
public class year
{
    public static void main(String[] args)
    {
    age parage=new age();
    parage.title();
    parage.page();
    }
}