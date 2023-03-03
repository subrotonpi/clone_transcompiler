public static int [ ] readIntArrayInRange ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  int [ ] l = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    l [ a ] += b ;
  }
  for ( int i = 1 ;
  i < l . length ;
  i ++ ) {
    l [ i ] += l [ i - 1 ] ;
    if ( k <= l [ i ] ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return l ;
}
