public static void input ( Scanner s ) {
  int [ ] X = new int [ 19 ] ;
  String [ ] A = {
    "Do" , "Re" , "Mi" , "Fa" , "So" , "La" , "Si" }
    ;
    for ( int i = 0 ;
    i < 19 ;
    i ++ ) {
      if ( s . charAt ( i ) == 'W' && s . charAt ( i + 1 ) == 'W' ) X [ i ] = i ;
    }
    if ( X [ 1 ] - X [ 0 ] == 7 ) {
      if ( X [ 0 ] == 0 ) System . out . println ( A [ 2 ] ) ;
      else if ( X [ 0 ] < 3 ) System . out . println ( A [ 1 ] ) ;
      else System . out . println ( A [ 0 ] ) ;
    }
    else {
      if ( X [ 0 ] == 0 ) System . out . println ( A [ 6 ] ) ;
      else if ( X [ 0 ] < 3 ) System . out . println ( A [ 5 ] ) ;
      else if ( X [ 0 ] < 5 ) System . out . println ( A [ 4 ] ) ;
      else System . out . println ( A [ 3 ] ) ;
    }
  }
  