static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A ) ;
  A . add ( 999999999999999 ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 1 ;
  i < 35 ;
  i ++ ) {
    B [ i ] = 2 * i ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A . get ( N - 1 - i ) == Integer . MIN_VALUE ) {
      for ( int j = 0 ;
      j < B . length ;
      j ++ ) {
        if ( A . get ( N - 1 - i ) < B [ j ] ) {
          break ;
        }
      }
      if ( A . get ( binarySearch ( A , B [ j ] - A . get ( N - 1 - i ) ) ) == B [ j ] - A . get ( N - 1 - i ) ) {
        if ( binarySearch ( A , B [ j ] - A . get ( N - 1 - i ) ) < N - 1 - i ) {
          A . set ( binarySearch ( A , B [ j ] - A . get ( N - 1 - i ) ) , - 0.1 ) ;
          A . get ( N - 1 - i ) + = 0.1 ;
          ans ++ ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return A ;
}
