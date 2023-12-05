public static void ai ( Function < String , List < Integer >> input ) {
  int n = Integer . parseInt ( input . apply ( " " ) ) ;
  int [ ] a = ai ( ) ;
  long big = Long . MAX_VALUE ;
  long small = Long . MAX_VALUE ;
  final int [ ] af = a . clone ( ) ;
  heapify ( af ) ;
  final int [ ] ar = Arrays . copyOf ( a , 2 * n ) ;
  heapify ( ar ) ;
  final int [ ] [ ] ans = new int [ n + 1 ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] [ 0 ] = 0 ;
  }
  ans [ 0 ] [ 0 ] = big ;
  ans [ n - 1 ] [ 1 ] = small ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( af [ 0 ] < a [ n + k ] ) {
      long b = heapify ( af , a [ n + k ] ) ;
      big += a [ n + k ] - b ;
    }
    ans [ k + 1 ] [ 0 ] = big ;
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    if ( - ar [ 0 ] > a [ n - k - 1 ] ) {
      long s = heapify ( ar , - a [ n - k - 1 ] ) ;
      small += a [ n - k - 1 ] + s ;
    }
    ans [ n - k - 2 ] [ 1 ] = small ;
  }
  System . out . println ( max ( i - j for ( i , j ) ;
  i < ans . length ;
  i ++ ) ) ;
}
