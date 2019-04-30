
/**
 * Testing code
 *
 * @Luke Wismer
 * @version 1.1.1
 */
public class Test
{
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;
    private Person p6;
    private Auction auction;
    public Test()
    {
        p1 = new Person("Justin");
        p2 = new Person("Russell");
        p3 = new Person("Dominic");
        p4 = new Person("Wendy");
        p5 = new Person("Reece");
        p6 = new Person("Morgan");
        auction = new Auction();
        setUpLots();
    }

    public void bidCall()
    {
        //int lotNumber, Person bidder, long value
        auction.makeABid(1, p1, 10);
        auction.makeABid(2, p2, 10);
        auction.makeABid(2, p3, 100);
      
        auction.makeABid(5, p6, 10);
    }

    public void closeCall()
    {
        auction.close();
    }

    public void callUnsold()
    {
        System.out.println(auction.getUnsold());
    }

   

    public void setUpLots()
    {
        auction.enterLot("Guitar");
        auction.enterLot("Glue");
        auction.enterLot("House");
        auction.enterLot("Keyboard");
        auction.enterLot("Chainsaw");
        auction.enterLot("Monitor");
    }

}
