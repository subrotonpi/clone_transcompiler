public static String print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] a = {
    'SS' , 'SW' , 'WS' , 'WW' }
    ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        if ( s . charAt ( i ) == 'o' ) {
          if ( a [ j ] [ i ] == 'S' ) {
            if ( a [ j ] [ i - 1 ] == 'S' ) {
              a [ j ] += 'S' ;
            }
            else {
              a [ j ] += 'W' ;
            }
          }
          else {
            if ( a [ j ] [ i - 1 ] == 'S' ) {
              a [ j ] += 'W' ;
            }
            else {
              a [ j ] += 'S' ;
            }
          }
        }
        else {
          if ( a [ j ] [ i ] == 'S' ) {
            if ( a [ j ] [ i - 1 ] == 'S' ) {
              a [ j ] += 'W' ;
            }
            else {
              a [ j ] += 'S' ;
            }
          }
          else {
            if ( a [ j ] [ i - 1 ] == 'S' ) {
              a [ j ] += 'W' ;
            }
            else {
              a [ j ] += 'S' ;
            }
          }
        }
      }
      String ans = "-1" ;
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        if ( a [ j ] [ 0 ] == a [ j ] [ j - 1 ] ) {
          if ( s . charAt ( 0 ) == 'o' ) {
            if ( a [ j ] [ 0 ] == 'S' && a [ j ] [ j - 2 ] == a [ j ] [ 1 ] ) {
              ans = a [ j ] . substring ( 0 , a [ j ] . length ( ) - 1 ) ;
              break ;
            }
            if ( a [ j ] [ 0 ] == 'W' && a [ j ] [ j - 2 ] != a [ j ] [ 1 ] ) {
              ans = a [ j ] . substring ( 0 , a [ j ] . length ( ) - 1 ) ;
              break ;
            }
          }
          if ( s . charAt ( 0 ) == 'x' ) {
            if ( a [ j ] [ 0 ] == 'S' && a [ j ] [ j - 2 ] != a [ j ] [ 1