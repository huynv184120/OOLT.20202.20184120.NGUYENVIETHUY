public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    private static int nbOrders = 0;
    private final DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private MyDate dateOrdered;
    public int qtyOrdered = 0;

    public Order()
    {
        if(nbOrders == MAX_LIMITED_ORDERS)
        {
            return;
        }else{
            ++nbOrders;
            dateOrdered = new MyDate();
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if(qtyOrdered != MAX_NUMBERS_ORDERED)
        {
            itemOrdered[qtyOrdered] = disc;
            ++qtyOrdered;

            System.out.println("Add " + disc.getTitle() + " into the list successfully");
        }else{
            System.out.println("Number of order has exceeded MAX_NUMBERS_ORDERED");
            System.out.println("Failed to add " + disc.getTitle() + " into the list");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... disc)
    {
        if(disc != null)
        {
            if(disc.length > 0 && disc.length + qtyOrdered >= MAX_NUMBERS_ORDERED)
            {
                System.out.println("Number of order has exceeded MAX_NUMBERS_ORDERED");
            }else{
                for (DigitalVideoDisc d : disc)
                {
                    itemOrdered[qtyOrdered++] = d;
                }

                System.out.println("Add " + disc.length + " discs into the list successfully");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        for (int i = 0; i < qtyOrdered; ++i)
        {
            if (disc.getTitle().equals(itemOrdered[i].getTitle()))
            {
                System.out.println("Remove " + disc.getTitle() + " from the list successfully");
                if (qtyOrdered - 1 - i >= 0)
                    System.arraycopy(itemOrdered, i + 1, itemOrdered, i, qtyOrdered - 1 - i);
                --qtyOrdered;
                assert itemOrdered[qtyOrdered].getTitle().equals(itemOrdered[qtyOrdered + 1].getTitle()) == false : "Error";
                break;
            }
        }
    }

    public float totalCost()
    {
        float sum = 0;

        for (int i = 0; i < qtyOrdered; ++i)
        {
            sum += itemOrdered[i].getCost();
        }

        return sum;
    }

    public void getList()
    {
        if (qtyOrdered == 0)
        {
            System.out.println("Empty list");
        }

        if (qtyOrdered != 0)
        {
            System.out.println("************Order************");
            System.out.print("Date: ");
            dateOrdered.Print();
            System.out.println("Ordered items:");
        }

        for (int i = 0; i < qtyOrdered; ++i)
        {
            System.out.print(i + 1 + ". ");
            itemOrdered[i].display();
        }

        if (qtyOrdered != 0)
        {
            System.out.println("*****************************");
        }
    }
}
