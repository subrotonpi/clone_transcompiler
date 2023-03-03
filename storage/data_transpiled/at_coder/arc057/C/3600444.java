public static void print ( int r ) {
  r = input . nextInt ( ) ;
  int s = r * r ;
  int t = ( r + 1 ) * r ;
  int a = s ;
  int p = 100 ;
  while ( p < t ) {
    int u = ( ( s - 1 ) / p + 1 ) * p ;
    if ( u < t ) {
      a = u / p ;
    }
    p *= 100 ;
  }
  System . out . println ( a ) ;
}
