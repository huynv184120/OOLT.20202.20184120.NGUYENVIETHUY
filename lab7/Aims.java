package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
	public void main (String[] args) {
		ArrayList<Books> books = new ArrayList<>();
		ArrayList<DigitalVideoDisc> dvds = new ArrayList<>();
        ArrayList<CompactDisc> cds = new ArrayList<>();
        books.add(new Books("asdfg", "asdfghj", 5.4f, null));
        books.add(new Books("asdfghjk", "zxcvbnm", 2.5f, null));
        books.add(new Books("asdfghj", "zxcvbnm", 6.7f, null));
        dvds.add(new DigitalVideoDisc("ejnkfwrheiu", "eretwre", 2.1f, 120, "b a cns"));
        dvds.add(new DigitalVideoDisc("wfs ejw", "av eb j", 4.5f, 90, "Ajbhewfsbe"));
        dvds.add(new DigitalVideoDisc("sdv bsbjdh vs", "wefbwsjb", 4.0f, 96, "Pjhbbfewsjewb"));
        dvds.add(new DigitalVideoDisc("ns vwsbm", "Cewfbbhefjbwehj", 4.3f, 100, "qhjbdjba"));

        int  choose = 0;
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        while(!exit)
        {
            Order.showMenu();
            choose = sn.nextInt();
            sn.nextLine();

            switch (choose) {
                case 1 -> {
                    if (Order.OrderList.size() < Order.MAX_NUMBERS_ORDERED) {
                        Order order = new Order();
                        System.out.println("Created a new order with id = " + order.getID());
                    }
                }
                case 2 -> {
                    System.out.println("***Add new item***");
                    System.out.println("Choose order");
                    Order.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Order.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Order.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    System.out.println("Choose item to be added into order");
                    System.out.println("1. Book");
                    System.out.println("2. CD");
                    System.out.println("3. DVD");

                    choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 1 || choose2 > 3) {
                        System.out.println("Invalid choice");
                        System.out.println("Choose item to be add into order");
                        System.out.println("1. Book");
                        System.out.println("2. CD");
                        System.out.println("3. DVD");

                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }

                    switch (choose2) {
                        case 1 -> {
                            int i = 0;
                            for (Books book : books)
                            {
                                i++;
                                System.out.print(i + ". ");
                                book.display();
                            }

                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            Order.OrderList.get(index - 1).addMedia(books.get(choose3 - 1));
                        }
                        case 2 -> {
                            System.out.print("Title: ");
                            String title = sn.nextLine();

                            System.out.print("Category: ");
                            String category = sn.nextLine();

                            System.out.print("Cost: ");
                            float cost = sn.nextFloat();
                            sn.nextLine();

                            System.out.print("Length: ");
                            int length = sn.nextInt();
                            sn.nextLine();

                            System.out.print("Director: ");
                            String director = sn.nextLine();

                            System.out.print("Artist: ");
                            String artist = sn.nextLine();

                            ArrayList<Track> tracks = new ArrayList<>();

                            System.out.print("Number of tracks: ");
                            int tracksNumber = sn.nextInt();
                            sn.nextLine();

                            for (int i = 0; i < tracksNumber; ++i) {
                                System.out.print("Title: ");
                                String trackTitle = sn.nextLine();

                                System.out.print("Length: ");
                                int trackLength = sn.nextInt();
                                sn.nextLine();

                                Track newTrack = new Track(trackTitle, trackLength);
                                tracks.add(newTrack);
                            }

                            CompactDisc newDisc = new CompactDisc
                                    (title, category, cost, length, director, artist, tracks);
                            Order.OrderList.get(index - 1).addMedia(newDisc);

                            System.out.println("Do you want to play " + title + "?");
                            System.out.println("0. No");
                            System.out.println("1. Yes");
                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            while(choose3 != 0 && choose3 != 1)
                            {
                                System.out.println("Invalid choice");
                                System.out.println("0. No");
                                System.out.println("1. Yes");

                                choose3 = sn.nextInt();
                                sn.nextLine();
                            }

                            if(choose3 == 1)
                            {
                                for (Track track : tracks)
                                {
                                    track.play();
                                }
                            }
                        }
                        case 3 -> {
                            int i = 0;
                            for (DigitalVideoDisc digitalVideoDisc : dvds)
                            {
                                System.out.print(++i + ". ");
                                digitalVideoDisc.display();
                            }

                            int choose3 = sn.nextInt();
                            sn.nextLine();

                            Order.OrderList.get(index - 1).addMedia(dvds.get(choose3 - 1));

                            System.out.println("Do you want to play " + dvds.get(choose3 - 1).getTitle());
                            System.out.println("0. No");
                            System.out.println("1. Yes");

                            int choose4 = sn.nextInt();
                            sn.nextLine();

                            while(choose4 != 0 && choose4 != 1)
                            {
                                System.out.println("Invalid choice");
                                System.out.println("0. No");
                                System.out.println("1. Yes");

                                choose4 = sn.nextInt();
                                sn.nextLine();
                            }

                            if(choose4 == 1)
                                dvds.get(choose3 - 1).play();
                        }
                    }

                }
                case 3 -> {
                    System.out.println("***Delete item***");
                    System.out.println("Choose order");
                    Order.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Order.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Order.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    Order.OrderList.get(index - 1).getList();

                    System.out.print("ID: ");
                    choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Order.OrderList.get(index - 1).getItemsOrdered().size()) {
                        System.out.println("Invalid choice");
                        System.out.print("ID: ");
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }

                    Order.OrderList.get(index - 1).removeMedia(choose2);

                    Order.OrderList.get(index - 1).getList();
                }
                case 4 -> {
                    System.out.println("Display order");
                    System.out.println("Choose order");
                    Order.listOrder();
                    int choose2 = sn.nextInt();
                    sn.nextLine();

                    while (choose2 < 0 || choose2 > Order.OrderList.size()) {
                        System.out.println("Invalid choice");
                        Order.listOrder();
                        choose2 = sn.nextInt();
                        sn.nextLine();
                    }
                    int index = choose2;

                    Order.OrderList.get(index - 1).getList();
                }
                case 0 -> exit = true;
            }
        }      
	}
}
