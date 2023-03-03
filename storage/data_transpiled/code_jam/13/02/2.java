public static String [ ] [ ] readAllStrings ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    char [ ] [ ] board = new char [ n ] [ ] ;
    String [ ] inpline = readLine ( ) . split ( "\\s+" ) ;
    int m = Integer . parseInt ( inpline [ 0 ] ) ;
    int n = Integer . parseInt ( inpline [ 1 ] ) ;
    Arrays . sort ( board ) ;
    Arrays . sort ( board ) ;
    List < String > bs = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        bs . add ( new String [ ] {
          readLine ( ) . split ( "\\s+" ) }
          ) ;
        }
      }
      Collections . sort ( bs ) ;
      boolean good = true ;
      Iterator < String > it = bs . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        String i = it . next ( ) ;
        String j = bs . get ( i ) ;
        if ( board [ i ] [ j ] == 'X' ) continue ;
        if ( Arrays . binarySearch ( board [ i2 ] [ j ] , board [ i2 ] [ j ] ) >= 0 ) {
          for ( int i2 = 0 ;
          i2 < m ;
          i2 ++ ) board [ i2 ] [ j ] = 'X' ;
        }
        else if ( Arrays . binarySearch ( board [ i ] [ j2 ] , board [ j2 ] ) >= 0 ) {
          for ( int j2 = 0 ;
          j2 < n ;
          j2 ++ ) board [ j2 ] [ j2 ] = 'X' ;
        }
        else {
          good = false ;
          break ;
        }
      }
      System . out . println ( "Case #" + ( v + 1 ) + ": " + ( good ? "YES" : "NO" ) ) ;
    }
    return board ;
  }
  