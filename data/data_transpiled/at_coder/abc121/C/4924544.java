static int n ( int m , int ... t ) {
  int ans = 0 ;
  for ( int a = 0 ;
  a < t . length ;
  a ++ ) {
    int b = t [ a ] ;
    ans += Math . min ( b , m ) * a ;
    m -= b ;
    if ( m <= 0 ) {
      System . out . println ( ans ) ;
      break ;
    }
  }
  return ans ;
}
