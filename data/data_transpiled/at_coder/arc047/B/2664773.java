public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] p = new int [ n ] [ 2 ] , x = new int [ n ] , y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = ( Integer . parseInt ( input ) ) ;
    int b = ( Integer . parseInt ( input ) ) ;
    p [ i ] = new int [ ] {
      a , b }
      ;
      x [ i ] = a + b ;
      y [ i ] = a - b ;
    }
    int a1 = max ( x ) , a2 = min ( x ) , b1 = max ( y ) , b2 = min ( y ) ;
    if ( a1 - a2 == b1 - b2 ) System . out . println ( ( ( a1 + a2 ) / 2 + ( b1 + b2 ) / 2 ) / 2 + ( ( a1 + a2 ) / 2 - ( b1 + b2 ) / 2 ) / 2 ) ;
    else {
      int d = max ( a1 - a2 , b1 - b2 ) ;
      int [ ] x2 = new int [ 2 ] , y2 = new int [ 2 ] , I = a1 - d / 2 , J = d / 2 + a2 ;
      for ( int i = 0 ;
      i < x2 . length ;
      i ++ ) for ( int j = 0 ;
      j < y2 . length ;
      j ++ ) {
        int I = ( i + j ) / 2 , J = ( i - j ) / 2 ;
        int num = Math . abs ( p [ 0 ] [ 0 ] - I ) + Math . abs ( p [ 0 ] [ 1 ] - J ) ;
        if ( Arrays . equals ( p [ 0 ] [ 0 ] , num ) ) X = I ;
        Y = J ;
      }
    }
    System . out . println ( X + " " + Y ) ;
  }
  