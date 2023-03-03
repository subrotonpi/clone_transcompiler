@ VisibleForTesting static int [ ] solve ( int N , int S ) {
  int base = Integer . parseInt ( input ( ) ) ;
  int S = Integer . parseInt ( input ( ) ) ;
  /* get the sum of the numbers */
  int [ ] nums = new int [ S ] ;
  while ( n > 0 ) {
    nums [ N ] = n % base ;
    n /= base ;
  }
  /* solve the number of numbers */
  if ( S == N ) {
    return S + 1 ;
  }
  for ( int i = 2 ;
  i <= S ;
  i ++ ) {
    if ( S == i ) {
      return nums ;
    }
  }
  return - 1 ;
}
