public static void main ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  char [ ] [ ] smap = new char [ w + 2 ] [ ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    smap [ i ] = '.' + input . charAt ( i ) . trim ( ) + '.' ;
  }
  smap [ w + 2 ] = '.' ;
  boolean isBlack = true ;
  for ( int i = 0 ;
  i < smap . length ;
  i ++ ) {
    char [ ] sline = smap [ i ] ;
    for ( int j = 0 ;
    j < sline . length ;
    j ++ ) {
      char s = sline [ j ] ;
      if ( s == '#' ) {
        if ( sline [ i ] [ j - 1 ] == '.' && sline [ i ] [ j + 1 ] == '.' && sline [ i - 1 ] [ j ] == '.' && sline [ i + 1 ] [ j ] == '.' ) {
          isBlack = false ;
        }
      }
    }
  }
  if ( isBlack ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
