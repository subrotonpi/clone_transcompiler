public static long E ( int i , long x ) {
  if ( i == 1 ) {
    return 5 * x ;
  }
  else {
    return ( 2 * i + 1 ) * x ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] G = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] SumG = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) SumG [ i ] = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) SumG [ i + 1 ] = SumG [ i ] + G [ i + 1 ] ;
  int pick = N * X ;
  long cost = Long . MAX_VALUE ;
  for ( int k = 1 ;
  k <= N ;
  k ++ ) {
    int trush = k * X ;
    long carry = 0 ;
    int i = 1 , upper = N - 1 , lower = N - 1 - k ;
    while ( lower >= 0 ) {
      carry += E ( i , SumG [ upper ] - SumG [ lower ] ) ;
      i = i + 1 ;
      upper = lower ;
      lower = lower - k ;
    }
    carry += E ( i , SumG [ upper ] ) ;
    cost = Math . min ( cost , pick + trush + carry ) ;
  }
  System . out . println ( cost ) ;
  return cost ;
}
