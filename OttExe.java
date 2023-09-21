class OttExe{
public static void main(String ott[]){
HotStar platform = new HotStar();
platform.addMovieName("KGF");
platform.addMovieName("Jailer");
platform.addMovieName("Hebbuli");
platform.addMovieName("Vishnuvardhana");
platform.addMovieName("Ghost");
platform.addMovieName("Hebbuli");
platform.addMovieName("Rajkumara");
platform.getMovieNames();

platform.delete("Ghost");
}
}