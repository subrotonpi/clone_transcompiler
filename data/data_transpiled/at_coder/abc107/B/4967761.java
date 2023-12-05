public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int w = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  StringBuilder b = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    b . append ( new StringBuilder ( input ) ) ;
  }
  for ( int i = h - 1 ;
  i >= 0 ;
  i -- ) {
    if ( b . toString ( ) . indexOf ( '.' ) == w ) {
      b . setLength ( 0 ) ;
      -- h ;
    }
  }
  for ( int i = w - 1 ;
  i >= 0 ;
  i -- ) {
    int count = 0 ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      if ( b . toString ( ) . charAt ( i ) == '.' ) {
        ++ count ;
      }
    }
    if ( count == h ) {
      for ( int j = 0 ;
      j < h ;
      j ++ ) {
        StringBuilder tmp = new StringBuilder ( b . toString ( ) . substring ( 0 , i ) ) ;
        tmp . append ( b . toString ( ) . substring ( i + 1 ) ) ;
        b . setCharAt ( j , tmp . toString ( ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    System . out . println ( b . toString ( ) ) ;
  }
}
