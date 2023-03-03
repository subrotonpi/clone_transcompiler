public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] Ass = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) Ass [ i ] = input . toCharArray ( ) ;
  char [ ] [ ] redss = new char [ W ] [ W - 1 ] ;
  char [ ] [ ] bluess = new char [ W ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( Ass [ i ] [ j ] == '#' ) {
      redss [ i ] [ j ] = '#' ;
      bluess [ i ] [ j ] = '#' ;
    }
  }
}
