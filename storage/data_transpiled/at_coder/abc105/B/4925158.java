public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i <= 100 ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 100 ;
    j ++ ) {
      if ( 4 * i + 7 * j == n ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
    }
  }
  System . out . println ( "No" ) ;
}
