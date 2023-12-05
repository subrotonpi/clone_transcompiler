public static final int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H % h == 0 && W % w == 0 ) {
    System . out . println ( "No" ) ;
  }
  else if ( H % h != 0 ) {
    System . out . println ( "Yes" ) ;
    int p = 100000 * ( h - 1 ) - 1 ;
    int q = - 100000 ;
    int L = ( int ) ( H / h ) ;
    for ( int l = 0 ;
    l < L ;
    l ++ ) {
      for ( int i = 0 ;
      i < W ;
      i ++ ) {
        System . out . print ( p ) ;
      }
      System . out . println ( "" ) ;
      for ( int i = 0 ;
      i < h - 1 ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          System . out . print ( q ) ;
        }
        System . out . println ( "" ) ;
      }
    }
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      System . out . print ( p ) ;
    }
    System . out . println ( "" ) ;
    for ( int i = 0 ;
    i < H - L * h - 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        System . out . print ( q ) ;
      }
    }
  }
  else {
    System . out . println ( "Yes" ) ;
    int p = 100000 * ( w - 1 ) - 1 ;
    int q = - 100000 ;
    int L = ( int ) ( W / w ) ;
    int [ ] s = ( new int [ L ] ) ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      for ( int i = 0 ;
      i < W ;
      i ++ ) {
        System . out . print ( s [ i ] + " " ) ;
      }
      System . out . println ( "" ) ;
    }
  }
  return H ;
}
