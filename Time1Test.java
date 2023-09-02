public class Time1Test
{
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("hour, minute, and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d%s", ((hour == 0 || hour == 12) ? 12 : hour), minute, second, (hour < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args)
    {
        Time1Test time = new Time1Test();

        displayTime("After time object is created", time);

        System.out.println();

        try
        {
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }

    public static void displayTime(String header, Time1Test t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
