public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Integer . parseInt ( input ) ;
  int [ ] [ ] res = new int [ W ] [ H ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < A [ i ] ;
    j ++ ) {
      res [ i ] [ j ] = - 1 ;
    }
  }
  int [ ] tmp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < A [ i ] ;
    j ++ ) {
      tmp [ i ] [ j ] = i + 1 ;
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String result = "" ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        result = result + tmp [ W * i + j ] ;
        if ( j != W - 1 ) result = result + " " ;
      }
      else {
        result = tmp [ W * i + j ] + result ;
        if ( j != W - 1 ) result = " " + result ;
      }
    }
  }
  System . out . println ( result ) ;
}
