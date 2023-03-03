public static void main ( String input ) {
  int [ ] [ ] c = new int [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    c [ i ] = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      c [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int [ ] a = {
    0 , 0 , 0 }
    ;
    int [ ] b = {
      0 , 0 , 0 }
      ;
      a [ 0 ] = 0 ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        b [ i ] = c [ 0 ] [ i ] - a [ 0 ] ;
      }
      a [ 1 ] = c [ 1 ] [ 0 ] - b [ 0 ] ;
      a [ 2 ] = c [ 2 ] [ 0 ] - b [ 0 ] ;
      boolean ans = true ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) {
          if ( c [ i ] [ j ] != a [ i ] + b [ j ] ) {
            ans = false ;
            break ;
          }
        }
      }
      if ( ans ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    