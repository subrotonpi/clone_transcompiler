public static void main ( String input ) {
  int tc ;
  int [ ] n = new int [ input . length ( ) ] ;
  for ( int i = 0 ;
  i < n . length ;
  i ++ ) {
    n [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  boolean found = false ;
  {
    int x = 0 ;
    int y = 0 ;
    int z = 0 ;
    if ( ( x == n . length ) && ( y == n . length ) ) {
      found = true ;
      return ;
    }
    String ret = "" ;
    for ( int i = 9 ;
    y != 0 ? n [ x ] : n [ x ] ;
    i -- ) {
      ret = Integer . toString ( i ) + f ( x + 1 , y == 0 ? ( i < n . length ) : n [ x ] , i ) ;
      if ( ( found ) ) break ;
    }
    return ;
  }
  System . out . println ( "Case #" + ( tc + 1 ) + ": " + Integer . toString ( f ( 0 , false , 0 ) / 10 ) ) ;
}
