public static void main ( String input ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    final int N = ( Integer . parseInt ( input ) ) ;
    final int X = ( Integer . parseInt ( input ) ) ;
    final int [ ] S = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      S [ i ] = Integer . parseInt ( input ) ;
    }
    final int len = Integer . parseInt ( input ) ;
    int res = 0 ;
    while ( len -- > 0 ) {
      final int a = S [ 0 ] ;
      boolean found = false ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) {
        final int b = S [ i ] ;
        if ( i > 0 && a + b <= X ) {
          S [ i ] -- ;
          len -- ;
          res ++ ;
          found = true ;
          break ;
        }
      }
      if ( ! found ) {
        len -- ;
        res ++ ;
      }
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + res ) ;
  }
}
