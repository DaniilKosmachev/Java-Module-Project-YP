public class Formatter {
    public String formatRubles (double price)
    {
        String format = "";
        double formatDoublePrice = Math.floor(price)%10;
        if (formatDoublePrice==1)
        {
            format = "рубль";
        } else if (formatDoublePrice >= 2 && formatDoublePrice <=4)
        {
            format = "рубля";
        } else if ((formatDoublePrice >= 5 && formatDoublePrice <=9) || formatDoublePrice == 0)
        {
            format = "рублей";
        }
        return format;
    }
}
