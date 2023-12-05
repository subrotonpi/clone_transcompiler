public static int [ ] readIntArrayFromFile ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] ar = new int [ a ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    ar [ i ] = 0 ;
  }
  for ( int r = 0 ;
  ;
  r < ar . length ;
  ) {
    if ( r % 2 == 1 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  return ar ;
}
