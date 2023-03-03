static final int solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 15 ;
    j ++ ) {
      if ( 4 * i + 7 * j == n ) {
        System . out . println ( "Yes" ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  System . out . println ( "No" ) ;
}
