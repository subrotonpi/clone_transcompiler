@ VisibleForTesting static int factorial ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Integer > prms = new HashMap < > ( ) ;
  int tmp = M ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( M ) ;
  i ++ ) {
    while ( ! tmp % i ) {
      if ( ! i == 0 ) prms . put ( i , 1 ) ;
      else prms . put ( i , 1 ) ;
      tmp /= i ;
    }
  }
  if ( tmp != 1 ) prms . put ( tmp , 1 ) ;
  long res = 1 ;
  /* cmb(a,b) */
  res = 1 ;
  if ( a - b < b ) {
    b = a - b ;
  }
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    res *= ( a - i ) ;
    res /= ( i + 1 ) ;
  }
  for ( Map . Entry < Integer , Integer > p : prms . entrySet ( ) ) {
    res *= p . getValue ( ) ;
    res %= 1000000007 ;
  }
  System . out . println ( res % 1000000007 ) ;
  return res ;
}
