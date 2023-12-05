public static void for ( int test = 0 ;
test < input . length ;
test ++ ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Collections . sort ( M ) ;
  int T [ ] = new int [ N + 1 ] ;
  T [ 0 ] = A ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    T [ i ] = T [ i - 1 ] + T [ i - 1 ] - 1 ;
  }
  for ( int m : M ) {
    int P [ ] = T ;
    T = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( m < P [ i ] ) {
        T [ i ] = Math . max ( T [ i ] , P [ i ] + m ) ;
      }
      if ( i < N ) {
        T [ i + 1 ] = Math . max ( T [ i + 1 ] , P [ i ] ) ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      T [ i + 1 ] = Math . max ( T [ i + 1 ] , T [ i ] * 2 - 1 ) ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( T [ i ] > 0 ) {
      ans = i ;
      break ;
    }
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
}
