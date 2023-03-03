public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < 10 * 5 ;
  i ++ ) {
    n = n - 2 ;
    tmp ++ ;
    if ( n < 0 ) {
      System . out . println ( "NO" ) ;
      break ;
    }
    if ( tmp == k ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
}
