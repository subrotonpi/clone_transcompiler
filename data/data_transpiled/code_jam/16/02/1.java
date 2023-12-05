public static void input ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int cs = 1 ;
  cs <= t ;
  cs ++ ) {
    String s = input . nextLine ( ) ;
    int result = 0 ;
    for ( char c : new StringBuilder ( s ) . reverse ( ) . toString ( ) . toCharArray ( ) ) {
      if ( ( c == '-' ) && ( result % 2 == 0 ) ) {
        result ++ ;
      }
      else if ( ( c == '+' ) && ( result % 2 == 1 ) ) {
        result ++ ;
      }
    }
    System . out . println ( "Case #" + cs + ": " + result ) ;
  }
}
