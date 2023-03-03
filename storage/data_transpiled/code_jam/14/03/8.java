public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    int R = Integer . parseInt ( in . nextLine ( ) ) ;
    int C = Integer . parseInt ( in . nextLine ( ) ) ;
    int M = Integer . parseInt ( in . nextLine ( ) ) ;
    if ( C == 1 ) {
      String ans = M * '*' + ( R - M - 1 ) * '.' + 'c' ;
      System . out . println ( String . format ( ans , C ) ) ;
      continue ;
    }
    if ( R == 1 ) {
      System . out . println ( M * '*' + ( C - M - 1 ) * '.' + 'c' ) ;
      continue ;
    }
    int clean = R * C - M ;
    if ( clean == 1 ) {
      System . out . println ( String . format ( "\n" , "c" , "*" , C - 1 ) + "*" + "*" + C ) ;
      continue ;
    }
    if ( clean == 2 || clean == 3 || clean == 5 || clean == 7 || ( ( R == 2 || C == 2 ) && clean % 2 != 0 ) ) {
      System . out . println ( "Impossible" ) ;
      continue ;
    }
    int [ ] bd = new int [ R ] ;
    bd [ 2 ] = 2 ;
    bd [ 3 ] = 0 ;
    int crea = 2 ;
    clean -= 4 ;
    while ( clean > 0 ) {
      boolean done = false ;
      if ( clean >= 2 ) {
        if ( bd [ 0 ] == 2 && C != 2 ) {
          bd [ 0 ] = bd [ 1 ] = 3 ;
          clean -= 2 ;
          done = true ;
        }
        else {
          if ( crea < R ) {
            bd [ crea ] = 2 ;
            crea ++ ;
            clean -= 2 ;
            done = true ;
          }
          if ( ! done && bd [ 0 ] != C ) {
            bd [ 0 ] ++ ;
            bd [ 1 ] ++ ;
            clean -= 2 ;
            done = true ;
          }
        }
      }
      if ( ! done ) {
        int [ ] idx = Arrays . copyOf ( bd , 2 ) ;
        for ( int x = range ( 2 , R ) . indexOf ( false ) + 2 ;
        x >= 0 ;
        x -- ) {
          bd [ idx [ x ] ++ ] = C ;
        }
      }
    }
    for