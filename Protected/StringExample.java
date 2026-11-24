class StringExample{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("is dead");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}