class ifstate{
    public static void main(String[] args)
    {
        String str = "GeeksforGeeks";
        int i = 5;

        // if block
        if (i == 5) {
            i++;
            System.out.println(str);
        }

        // Executed by default
        System.out.println("i = " + i);
    }
}