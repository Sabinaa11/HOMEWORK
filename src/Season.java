public enum Season {

    SUMMER("summer"), AUTUMN("autumn"), WINTER("winter"), SPRING("spring");


    private String season;

    private Season(String s) {
        season = s;
    }


    public String getSeason(){
        return season;
    }

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.getSeason());
        }
    }
}