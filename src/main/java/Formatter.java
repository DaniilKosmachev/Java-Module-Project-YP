public class Formatter {
    public String formatRubles(double price) {
        String format = "";
        int priceInt = (int) price;
        int lastNum = priceInt % 10;
        int lastTwoNum = priceInt % 100;
        if (lastTwoNum >= 11 && lastTwoNum <= 14) {
            format = "рублей";
        } else if (lastNum == 1) {
            format = "рубль";
        } else if (lastNum >= 2 && lastNum <= 4) {
            format = "рубля";
        } else if ((lastNum >= 5 && lastNum <= 9) || lastNum == 0) {
            format = "рублей";
        }
        return format;
    }
}
