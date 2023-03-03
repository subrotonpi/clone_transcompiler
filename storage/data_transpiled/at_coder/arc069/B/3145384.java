public static boolean solve ( String s ) {
  int n = Integer . parseInt ( input ) ;
  String s = input ;
  Pattern [ ] patterns = {
    new Pattern ( "S" , "W" ) , new Pattern ( "W" , "S" ) , new Pattern ( "S" , "S" ) , new Pattern ( "W" , "W" ) }
    ;
    /* solve the pattern */
    boolean [ ] l = new boolean [ n ] ;
    l [ 0 ] = true ;
    l [ 1 ] = true ;
    for ( int i = 1 ;
    i < n - 1 ;
    i ++ ) {
      if ( ( s . charAt ( i ) == 'o' && l [ i ] == 'S' ) || ( s . charAt ( i ) == 'x' && l [ i ] == 'W' ) ) {
        l [ i + 1 ] = l [ i - 1 ] ;
      }
      else {
        if ( l [ i - 1 ] == 'S' ) {
          l [ i + 1 ] = 'W' ;
        }
        else {
          l [ i + 1 ] = 'S' ;
        }
      }
    }
    boolean va ;
    boolean vb ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( s . charAt ( i ) == 'o' && l [ i - 1 ] == 'S' ) || ( s . charAt ( i ) == 'x' && l [ i - 1 ] == 'W' ) ) {
        va = ( l [ i - 2 ] == l [ 0 ] ) ;
      }
      else {
        va = ( l [ i - 2 ] != l [ 0 ] ) ;
      }
      if ( ( s . charAt ( 0 ) == 'o' && l [ 0 ] == 'S' ) || ( s . charAt ( 0 ) == 'x' && l [ 0 ] == 'W' ) ) {
        vb = ( l [ 1 ] == l [ l . length - 1 ] ) ;
      }
      else {
        vb = ( l [ 1 ] != l [ l . length - 1 ] ) ;
      }
      /* print va & vb */
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int res = solve ( patterns [ i ] ) ;
        if ( res ) {
          System . out . print ( ( String ) res ) ;
          break ;
        }
      }
    }
    return va & vb ;
  }
  