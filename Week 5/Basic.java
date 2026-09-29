public class Basic {
    public static void main(String[] args){
        String[] favorite = {"WebNovels", "Drawing", "Games", "Money", "Knowledge"};

        for(int i = 0; i < favorite.length; i++){
            System.out.println("Favorite thing # " + (i + 1) + ": " + favorite[i]);
        }
        System.out.println("String length: " + favorite.length);

    }
}
