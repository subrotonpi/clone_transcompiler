public static void main ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int w = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  char [ ] [ ] a = new char [ h + 2 ] [ ] ;
  for ( int i = 0 ;
  i < h + 2 ;
  i ++ ) {
    a [ i ] = null ;
  }
  a [ 0 ] = new char [ w + 2 ] ;
  for ( int i = 0 ;
  i < w + 2 ;
  i ++ ) {
    a [ i ] = '#' ;
  }
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    a [ i ] = new char [ h + 1 ] ;
    for ( int j = 0 ;
    j < w + 1 ;
    j ++ ) {
      a [ i ] [ j ] = '#' ;
    }
  }
  for ( int i = 0 ;
  i < h + 2 ;
  i ++ ) {
    System . out . println ( new String ( a [ i ] ) ) ;
  }
}
