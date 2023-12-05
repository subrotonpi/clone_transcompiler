public static int select3 ( @ Nonnull int A , @ Nonnull int B , @ Nonnull int C , @ Nonnull int D , @ Nonnull int E ) {
  int [ ] l = {
    A , B , C , D , E }
    ;
    int [ ] res = new int [ 1 << 5 ] ;
    for ( int i = 0 ;
    i < 1 << 5 ;
    i ++ ) {
      int s = 0 , c = 0 ;
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        if ( ( i & ( 1 << j ) ) == 0 ) {
          continue ;
        }
        s += l [ j ] ;
        c ++ ;
      }
      if ( c != 3 ) {
        continue ;
      }
      res [ i ] = s ;
    }
    return Arrays . stream ( res ) . sorted ( ( x , y ) -> - x ) . findFirst ( ) . get ( ) ;
  }
  