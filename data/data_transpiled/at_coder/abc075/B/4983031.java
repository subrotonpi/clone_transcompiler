public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] S = new char [ H + 2 ] [ W + 2 ] ;
  S [ 0 ] = new char [ W + 2 ] ;
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    S [ i ] = new char [ ] {
      '' }
      ;
      S [ i ] . getChars ( 0 , '.' , '/' ) ;
      S [ i ] . getChars ( 0 , '/' , '/' ) ;
    }
    S [ H + 1 ] = new char [ W + 2 ] ;
    char [ ] [ ] ans = new char [ H ] [ W + 2 ] ;
    ans [ 0 ] = new char [ H ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) ans [ i ] [ 0 ] = '#' ;
    for ( int i = 1 ;
    i <= H ;
    i ++ ) {
      for ( int j = 1 ;
      j <= W ;
      j ++ ) {
        if ( S [ i ] [ j ] == '.' ) {
          ans [ i - 1 ] [ j - 1 ] += S [ i - 1 ] [ j - 1 ] . charAt ( 0 ) ;
          ans [ i - 1 ] [ j - 1 ] += S [ i ] [ j - 1 ] . charAt ( 0 ) ;
          ans [ i - 1 ] [ j - 1 ] += S [ i + 1 ] [ j - 1 ] . charAt ( 0 ) ;
          ans [ i - 1 ] [ j - 1 ] += S [ i + 1 ] [ j - 1 ] . charAt ( 0 ) ;
        }
        else ans [ i - 1 ] [ j - 1 ] = '#' ;
      }
    }
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        System . out . print ( ans [ i ] [ j ] ) ;
      }
      System . out . println ( ) ;
    }
  }
  