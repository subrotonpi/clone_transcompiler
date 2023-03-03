public static int X = Math . abs ( int input ) {
  int n = 0 ;
  while ( true ) {
    if ( n * ( n + 1 ) / 2 >= X ) {
      ans = n ;
      break ;
    }
    n ++ ;
  }
  return ans ;
}
