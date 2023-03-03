public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    int res = 0 ;
    Map < Integer , Integer > WALL = new HashMap < Integer , Integer > ( ) ;
    int [ ] [ ] attacks = new int [ N ] [ ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      int di = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int ni = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int wi = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int ei = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int si = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int deltadi = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int deltaPi = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      int deltasi = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
      for ( ;
      di < ni ;
      di ++ ) {
        attacks [ di ] [ wi ] = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
        int prevDay = - 1 ;
        int idx = 0 ;
        int [ ] successAttacks = new int [ trials ] ;
        while ( idx < attacks . length ) {
          int di = attacks [ idx ] [ 0 ] ;
          int wi = attacks [ idx ] [ 1 ] ;
          int ei = attacks [ idx ] [ 2 ] ;
          int si = attacks [ idx ] [ 3 ] ;
          if ( di != prevDay ) {
            for ( int dIdx : successAttacks ) {
              int ddi = attacks [ dIdx ] [ 0 ] ;
              int dwi = attacks [ dIdx ] [ 1 ] ;
              int dei = attacks [ dIdx ] [ 2 ] ;
              int dsi = attacks [ dIdx ] [ 3 ] ;
              for ( int didx : xrange ( dwi , dei ) ) {
                if ( WALL . get ( didx , dsi ) < dsi ) {
                  WALL . put ( didx , dsi ) ;
                }
              }
            }
            successAttacks [ dIdx ] = dIdx ;
          }
        }
        boolean flag = false ;
        for ( int i : xrange ( wi , ei ) ) {
          