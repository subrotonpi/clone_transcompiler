public static void print ( int a ) {
  int n = 0 ;
  a = input . nextInt ( ) ;
  l = a * a ;
  r = l + 2 * a + 1 ;
  e = 1 ;
  while ( ( l + e - 1 ) / e * e < r ) {
    n = ( l + e - 1 ) / e ;
    e *= 100 ;
  }
  System . out . println ( n ) ;
}
