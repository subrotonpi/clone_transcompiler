@ task ( "A" ) public static void main ( String task ) throws IOException {
  int type = 2 ;
  BufferedReader in ;
  if ( type == 0 ) in = new BufferedReader ( new FileReader ( "sample.in" ) ) ;
  else if ( type == 1 ) in = new BufferedReader ( new FileReader ( task + "-small.in" ) ) ;
  else in = new BufferedReader ( new FileReader ( task + "-large.in" ) ) ;
  PrintWriter outp = new PrintWriter ( task + ".out" ) ;
  int T = Integer . parseInt ( in . readLine ( ) . substring ( 0 , in . readLine ( ) . length ( ) - 1 ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    String ans = "" ;
    String st = in . readLine ( ) . substring ( 0 , in . readLine ( ) . length ( ) - 1 ) ;
    char curmax = 0 ;
    for ( int j = 0 ;
    j < st . length ( ) ;
    j ++ ) {
      char c = st . charAt ( j ) ;
      if ( ( c >= curmax ) && ( c <= '9' ) ) {
        ans = c + ans ;
        curmax = c ;
      }
      else {
        ans = ans + c ;
      }
    }
    outp . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
  }
}
