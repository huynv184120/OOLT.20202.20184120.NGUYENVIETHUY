public class DateUtils {
    public static int compare(MyDate d1, MyDate d2)
    {
        if(d1.getYear() > d2.getYear())
            return 1;
        else
            if(d1.getYear() < d2.getYear())
                return -1;
            else
                if(d1.getMonth() > d2.getMonth())
                    return 1;
                else
                    if(d1.getMonth() < d2.getMonth())
                        return -1;
                    else
                        if(d1.getDay() > d2.getDay())
                            return 1;
                        else
                            if(d1.getDay() < d2.getDay())
                                return -1;
                            else
                                return 0;
    }

    public static void sort(MyDate[] listOfDate)
    {
        for (int i = 0; i < listOfDate.length - 1; ++i)
        {
            for (int j = i + 1; j < listOfDate.length; ++j)
            {
                if(compare(listOfDate[i], listOfDate[j]) == 1)
                {
                    MyDate.swap(listOfDate[i], listOfDate[j]);
                }
            }
        }
    }
}