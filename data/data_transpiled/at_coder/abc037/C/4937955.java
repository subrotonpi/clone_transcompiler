public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  int s = Integer . MAX_VALUE * K ;
  for ( int k = 1 ;
  k < K ;
  k ++ ) s -= a [ k - 1 ] * ( K - k - i - 1 ) ;
  return s ;
}
