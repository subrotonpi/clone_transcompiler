public static void print ( int a ) {
  int l = a * a ;
  int r = ( a + 1 ) * a ;
  int ans = l ;
  int p = 100 ;
  while ( p < r ) {
    int u = ( ( l - 1 ) / p + 1 ) * p ;
    if ( u < r ) ans = u / p ;
    p *= 100 ;
  }
  System . out . println ( ans ) ;
}
