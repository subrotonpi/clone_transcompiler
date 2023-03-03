public static int N = Integer . parseInt ( Scanner in ) {
  for ( int testCase : xrange ( 1 , N + 1 ) ) {
    String [ ] Z = in . nextLine ( ) . split ( "\\s+" ) ;
    int n = Integer . parseInt ( Z [ 0 ] ) ;
    int A = Integer . parseInt ( Z [ 1 ] ) ;
    int B = Integer . parseInt ( Z [ 2 ] ) ;
    int C = Integer . parseInt ( Z [ 3 ] ) ;
    int D = Integer . parseInt ( Z [ 4 ] ) ;
    int x0 = Integer . parseInt ( Z [ 5 ] ) ;
    int y0 = Integer . parseInt ( Z [ 6 ] ) ;
    int M = Integer . parseInt ( Z [ 7 ] ) ;
    int [ ] [ ] r = new int [ ] [ ] {
      {
        0 , 0 , 0 }
        , {
          0 , 0 , 0 }
          , {
            0 , 0 , 0 }
          }
          ;
          r [ x0 % 3 ] [ y0 % 3 ] ++ ;
          int X = x0 ;
          int Y = y0 ;
          for ( int i : xrange ( 1 , n ) ) {
            X = ( A * X + B ) % M ;
            Y = ( C * Y + D ) % M ;
            r [ X % 3 ] [ Y % 3 ] ++ ;
          }
          int num = 0 ;
          num += r [ 0 ] [ 0 ] * ( r [ 0 ] [ 0 ] - 1 ) * ( r [ 0 ] [ 0 ] - 2 ) / 6 ;
          num += r [ 1 ] [ 1 ] * ( r [ 1 ] [ 1 ] - 1 ) * ( r [ 1 ] [ 1 ] - 2 ) / 6 ;
          num += r [ 2 ] [ 2 ] * ( r [ 2 ] [ 2 ] - 1 ) * ( r [ 2 ] [ 2 ] - 2 ) / 6 ;
          num += r [ 0 ] [ 0 ] * r [ 1 ] [ 0 ] * r [ 2 ] [ 1 ] ;
          num += r [ 0 ] [ 1 ] * r [ 2 ] [ 1 ] ;
          num += r [ 1 ] [ 2 ] * r [ 2 ] [ 2 ] [ 0 ] ;
          num += r [ 1 ] [ 2 ] * r [ 0 ] [ 1 ] ;
          num += r [ 2 ] [ 2 ] * r [ 1 ] [ 0 ] * r [ 2 ] [ 1 ] ;
          num += r [ 2 ] [ 2 ] * r [ 2 ] [ 2 ] ;
          num += r [ 0 ]