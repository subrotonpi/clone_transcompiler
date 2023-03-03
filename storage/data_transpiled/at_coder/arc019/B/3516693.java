public static int input ( ) {
  int s = input . nextInt ( ) ;
  int n = s . length ( ) ;
  int k = 0 ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    if ( s . charAt ( i ) != s . charAt ( n - 1 - i ) ) {
      k ++ ;
    }
  }
  int a ;
  switch ( k ) {
    case 0 : a = 25 * ( n - n % 2 ) ;
    break ;
  }
  return a ;
}
