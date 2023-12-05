private static boolean valid ( int [ ] sol , int [ ] [ ] shakes ) {
  for ( int i = 0 ;
  i < shakes . length ;
  i ++ ) {
    int i = 0 ;
    while ( i < shakes [ i ] . length ) {
      if ( shakes [ i + 1 ] == sol [ shakes [ i ] . length - 1 ] ) {
        break ;
      }
      i += 2 ;
    }
    if ( i >= shakes . length ) {
      return false ;
    }
  }
  /* solve the number of shakes */
  sol = new int [ N ] ;
  boolean changed = true ;
  while ( ( changed = sol . get ( ) ) != true ) {
    changed = false ;
    for ( int i = 0 ;
    i < shakes . length ;
    i ++ ) {
      if ( shakes [ i ] . length == 2 && shakes [ i ] [ 1 ] == 1 && sol [ shakes [ i ] [ 0 ] - 1 ] == 0 ) {
        changed = true ;
        sol [ shakes [ i ] [ 0 ] - 1 ] = 1 ;
        for ( int j : xrange ( shakes . length ) ) {
          int [ ] s = shakes [ j ] ;
          int i = 0 ;
          while ( i < s . length ) {
            if ( s [ i ] == shakes [ i ] [ 0 ] && s [ i + 1 ] == 0 ) {
              s = s [ 0 ] + s [ i + 1 ] ;
              s = s [ i + 1 ] + s [ i + 1 ] ;
            }
            i += 2 ;
          }
          shakes [ j ] = s ;
        }
      }
    }
  }
  if ( valid ( sol , shakes ) ) {
    return Arrays . toString ( sol ) . equals ( "IMPOSSIBLE" ) ;
  }
  if ( __name__ . equals ( "java.util.Scanner" ) ) {
    final Scanner scanner = new Scanner ( System . in ) ;
    final int C = scanner . nextInt ( ) ;
    for ( int i : xrange ( C ) ) {
      final int N = scanner . nextInt ( ) ;
      final int M = scanner . nextInt ( ) ;
      shakes = new String [ N ] ;
      for ( int j : xrange ( M ) ) {
        shakes [ j ] = map ( Integer . parseInt ( scanner . nextLine ( ) ) . substring ( 1 ) ) ;
      }
      System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( N