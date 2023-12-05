@ VisibleForTesting static int [ ] getPrimeNumbers ( int n ) {
  if ( n == 1 ) {
    return 0 ;
  }
  for ( int k = 2 ;
  k <= ( int ) Math . sqrt ( n ) ;
  k ++ ) {
    if ( n % k == 0 ) {
      return 0 ;
    }
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ Q ] ;
  int [ ] R = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    L [ i ] = 0 ;
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int min_L = Math . min ( L , Integer . MAX_VALUE ) ;
  int max_R = Math . max ( R , Integer . MAX_VALUE ) ;
  int [ ] check = new int [ Q ] ;
  for ( int i = min_L ;
  i <= max_R ;
  i ++ ) {
    int flg ;
    if ( ( i % 2 ) == 1 ) {
      flg = ( isPrimeNumbers ( i ) && isPrimeNumbers ( ( i + 1 ) / 2 ) ) ;
    }
    else {
      flg = 0 ;
    }
    check [ i ] = flg ;
  }
  Arrays . sort ( check ) ;
  check = Arrays . copyOf ( check , Q ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    System . out . println ( check [ R [ i ] - min_L + 1 ] - check [ L [ i ] - min_L ] ) ;
  }
  return check ;
}
