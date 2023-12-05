public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] S = new char [ H + 2 ] [ W + 2 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    S [ i ] [ 0 ] = '.' ;
    S [ i ] [ 1 ] = '.' ;
  }
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    S [ i ] [ 0 ] = '.' ;
  }
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( S [ i ] [ j ] == '.' ) {
        S [ i ] [ j ] = String . valueOf ( new char [ ] {
          S [ i - 1 ] [ j - 1 ] , S [ i - 1 ] [ j ] , S [ i - 1 ] [ j + 1 ] , S [ i ] [ j - 1 ] , S [ i ] [ j + 1 ] , S [ i + 1 ] [ j - 1 ] , S [ i + 1 ] [ j ] , S [ i + 1 ] [ j + 1 ] }
          ) . indexOf ( '#' ) ;
        }
      }
    }
    for ( int i = 1 ;
    i <= H ;
    i ++ ) {
      System . out . println ( new String ( S [ i ] , 1 , W + 1 ) ) ;
    }
  }
  