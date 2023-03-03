public static int robot ( @ Nonnull String S ) {
  int N = S . length ( ) ;
  int [ ] Sp = new int [ N + 1 ] , Sm = new int [ N + 1 ] ;
  double [ ] A = new double [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Double . MAX_VALUE ;
  }
  S = new String ( S ) ;
  int M = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char c = S . charAt ( i ) ;
    Sp [ i + 1 ] = Sp [ i ] ;
    Sm [ i + 1 ] = Sm [ i ] ;
    if ( c == 'M' ) {
      M ++ ;
      A [ i + 1 ] = Sp [ i ] - Sm [ i ] ;
    }
    else if ( c == '+' ) {
      Sp [ i + 1 ] ++ ;
    }
    else {
      Sm [ i + 1 ] ++ ;
    }
  }
  Arrays . sort ( A ) ;
  return Arrays . binarySearch ( A , M / 2 , M ) - Arrays . binarySearch ( A , 0 , M / 2 , M ) ;
}
if ( getClass ( ) . equals ( String . class ) ) {
  S = input ( ) ;
  int ans = robot ( S ) ;
  System . out . println ( ans ) ;
}
