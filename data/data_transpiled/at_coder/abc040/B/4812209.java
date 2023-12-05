public static void print ( int n ) {
  int s = ( int ) ( n * 0.5 ) ;
  int best = 10 * 9 ;
  for ( int i = s ;
  i > 0 ;
  i -- ) {
    int q = n / i ;
    int m = n % i ;
    best = Math . min ( best , Math . abs ( i - q ) + m ) ;
  }
  System . out . println ( best ) ;
}
