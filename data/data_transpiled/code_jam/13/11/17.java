@ functools . public static void solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new OutputStreamWriter ( ouf ) ) ;
  Function < String , String > input = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return inf . readLine ( ) . trim ( ) ;
    }
  }
  ;
  print ( input ) ;
}
