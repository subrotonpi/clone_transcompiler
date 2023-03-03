public static void raw_input ( ) {
  int n = Integer . parseInt ( readLine ( ) ) , M = Integer . parseInt ( readLine ( ) ) ;
  System . out . println ( "Case #1:" ) ;
  for ( int m = 2 * ( n / 2 - 1 ) ;
  m <= 2 * ( n / 2 ) ;
  m ++ ) {
    if ( M == 0 ) break ;
    M -- ;
    String s = Integer . toBinaryString ( m ) ;
    String t = s + StringUtil . reverse ( s ) ;
    System . out . println ( t + "," ) ;
    for ( int i = 2 ;
    i < 11 ;
    i ++ ) {
      System . out . println ( i + 1 + "," ) ;
    }
    System . out . println ( ) ;
  }
}
