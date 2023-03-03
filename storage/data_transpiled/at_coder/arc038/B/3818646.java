@ MoreRequires public static boolean judge ( int x , int y ) {
  final int [ ] ADJUSTS = {
    ( 0 , 1 ) , ( 1 , 0 ) , ( 1 , 1 ) }
    ;
    int H = Integer . parseInt ( input ( ) ) ;
    int W = Integer . parseInt ( input ( ) ) ;
    final char [ ] [ ] S = new char [ H ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      S [ i ] = input ( ) ;
    }
    @ Override public boolean judge ( int x , int y ) {
      if ( ( ! ( 0 <= x && x < W && y < H ) ) || ( ! ( 0 <= y && y < W ) ) ) return true ;
      return false ;
    }
  }
  