public static int [ ] readInput ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int ans = 200 ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) {
    int timeA = 0 ;
    int timeB = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i > j & 1 ) {
        timeA += t [ j ] ;
      }
      else {
        timeB += t [ j ] ;
      }
    }
    ans = Math . min ( ans , Math . max ( timeA , timeB ) ) ;
  }
  System . out . println ( ans ) ;
  return t ;
}
