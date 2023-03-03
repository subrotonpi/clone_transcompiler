public static void print ( int a ) {
  int i = a * a ;
  int l = i ;
  int r = i + 2 * a ;
  while ( l <= r ) {
    i = l ;
    l = ( l + 99 ) / 100 ;
    r = r / 100 ;
  }
  System . out . println ( i ) ;
}
