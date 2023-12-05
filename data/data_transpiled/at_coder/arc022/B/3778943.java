public static void func ( int n , int [ ] a ) {
  int [ ] table = new int [ 10 * 6 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    table [ i ] = 0 ;
  }
  int under = 0 ;
  int top = 0 ;
  int length = 0 ;
  while ( under < a . length && top < a . length ) {
    while ( top < a . length && table [ a [ top ] ] == 0 ) {
      table [ a [ top ] ] ++ ;
      top ++ ;
    }
    length = Math . max ( length , a . length ) ;
  }
}
