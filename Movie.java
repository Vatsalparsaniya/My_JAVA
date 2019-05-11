public class Movie{

    private String title;
    private String studio;
    private String rating;

    Movie(String ti,String st, String ra){
        title = ti;
        studio = st;
        rating = ra;
    }
    Movie(String ti, String st){
        title = ti;
        studio = st;
        rating = "PG";
    }

    static Movie[] getPG(Movie[] arr){
        Movie narr[] = new Movie[4];
        //static int j =0;
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].rating == "PG")
                narr[j++] = arr[i];
        }
        return narr;
    }

    public static void main(String[] args) {
        Movie[] obj = new Movie[4];
        obj[0] = new Movie("Casino Royale","Eon Production","PG-13");
        obj[1] = new Movie("Gentleman","Star Production");
        obj[2] = new Movie("Dangal","Sony Production","PG 1");
        obj[3] = new Movie("Chak De India","Equa Production");

        Movie obj2[] = getPG(obj);

        for(int i=0; i<2; i++)
            System.out.println("Title: " + obj2[i].title + " Studio: " + obj2[i].studio);
    }
}
