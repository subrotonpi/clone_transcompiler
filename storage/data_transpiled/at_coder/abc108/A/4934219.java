public static void print ( int k ) {
  int even ;
  int odd ;
  if ( k % 2 == 0 ) {
    even = k / 2 ;
    odd = k / 2 ;
  }
  else {
    even = k / 2 ;
    odd = k / 2 + 1 ;
  }
  print ( even * odd ) ;
}
