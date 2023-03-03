public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] Tn = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Tn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( Tn ) ;
  int busCount = 1 ;
  int busRiderCount = 0 ;
  int minT = Tn [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( busRiderCount < C && minT + K >= T ) {
      busRiderCount ++ ;
    }
    else {
      busCount ++ ;
      busRiderCount = 1 ;
      minT = T ;
    }
  }
  System . out . println ( busCount ) ;
  return busCount ;
}
