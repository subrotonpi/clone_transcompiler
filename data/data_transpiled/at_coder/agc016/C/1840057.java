public static void print ( int H , int W , int h , int w ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    if ( H % h == 0 && W % w == 0 ) {
      System . out . println ( "No" ) ;
    }
    else if ( W % w != 0 ) {
      System . out . println ( "Yes" ) ;
      for ( int y = 0 ;
      y < H ;
      y ++ ) {
        for ( int x = 0 ;
        x < W ;
        x ++ ) {
          if ( x != 0 ) {
            System . out . print ( " " ) ;
          }
          if ( ( x % w ) != ( w - 1 ) ) {
            System . out . print ( 100000 ) ;
          }
          else {
            System . out . print ( - 100000 * ( w - 1 ) - 1 ) ;
          }
        }
        System . out . println ( ) ;
      }
    }
    else {
      System . out . println ( "Yes" ) ;
      for ( int y = 0 ;
      y < H ;
      y ++ ) {
        for ( int x = 0 ;
        x < W ;
        x ++ ) {
          if ( x != 0 ) {
            System . out . print ( " " ) ;
          }
          if ( ( y % h ) != ( h - 1 ) ) {
            System . out . print ( 100000 ) ;
          }
          else {
            System . out . print ( - 100000 * ( h - 1 ) - 1 ) ;
          }
        }
        System . out . println ( ) ;
      }
    }
  }
}
