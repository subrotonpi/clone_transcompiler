@ String ( filename = "A-large.in" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( filename ) ) ;
  PrintWriter of = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A-large.out" ) ) ) ;
  int N = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    int n = Integer . parseInt ( br . readLine ( ) ) ;
    String [ ] a = br . readLine ( ) . split ( "\\s+" ) ;
    Arrays . sort ( a ) ;
    Arrays . sort ( b ) ;
  }
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
}
