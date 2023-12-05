public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int [ ] W = new int [ N ] ;
  int [ ] E = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i - 1 ) == 'W' ) {
      W [ i ] = W [ i - 1 ] + 1 ;
    }
    else {
      W [ i ] = W [ i - 1 ] ;
    }
    if ( S . charAt ( N - i ) == 'E' ) {
      E [ N - i - 1 ] = E [ N - i ] + 1 ;
    }
    else {
      E [ N - i - 1 ] = E [ N - i ] ;
    }
  }
  int count = N ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count = Math . min ( count , W [ i ] + E [ i ] ) ;
  }
  System . out . println ( count ) ;
  return count ;
}
