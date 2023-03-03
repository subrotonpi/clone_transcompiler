@ functools . VisibleForTesting static void solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( "output.txt" ) ) ;
  Function < String , String > input = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return inf . readLine ( ) . trim ( ) ;
    }
  }
  ;
  Function < String , String > print = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return ouf . apply ( input ) ;
    }
  }
  ;
}
