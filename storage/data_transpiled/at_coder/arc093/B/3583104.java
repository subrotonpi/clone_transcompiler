public static int [ ] inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  /* nextin nwin */
  int nx = nwin ;
  int ny = nwin ;
  if ( nx != 98 ) {
    return new int [ ] {
      nx + 2 , ny }
      ;
    }
    else {
      return new int [ ] {
        0 , ny + 2 }
        ;
      }
      char [ ] [ ] Wh = new char [ 100 ] [ 50 ] ;
      int [ ] nowin = {
        0 , 0 }
        ;
        for ( int i = 0 ;
        i < A - 1 ;
        i ++ ) {
          int ix = nowin [ i ] ;
          int iy = nowin [ i ] ;
          Wh [ iy ] [ ix ] = '#' ;
          nowin = nextin ( nowin [ i ] ) ;
        }
        char [ ] [ ] Bl = new char [ 100 ] [ 50 ] ;
        for ( int i = 0 ;
        i < Bl . length ;
        i ++ ) {
          int ix = nowin [ i ] ;
          int iy = nowin [ i ] ;
          Bl [ iy ] [ ix ] = '#' ;
          nowin = nextin ( nowin [ i ] ) ;
        }
        System . out . println ( "100" + "," 100 " ) ; for ( int i = 0 ; i < Wh . length ; i ++ ) { System . out . println ( new String ( Wh [ i ] ) ) ; } for ( int j = 0 ; j < Bl . length ; j ++ ) { System . out . println ( new String ( Bl [ j ] ) ) ; } return null ; }