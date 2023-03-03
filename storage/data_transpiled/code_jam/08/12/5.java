static final Scanner getScanner ( ) throws FileNotFoundException {
  Scanner i = new Scanner ( new File ( "1b.in" ) ) ;
  int C = Integer . parseInt ( i . nextLine ( ) ) ;
  for ( int c = 1 ;
  c <= C ;
  c ++ ) {
    int N = Integer . parseInt ( i . nextLine ( ) ) ;
    int M = Integer . parseInt ( i . nextLine ( ) ) ;
    int [ ] [ ] p = new int [ M ] [ N ] ;
    int [ ] r = new int [ N ] ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      StringTokenizer ci = new StringTokenizer ( i . nextLine ( ) ) ;
      ci . nextToken ( ) ;
      int [ ] d = new int [ N ] ;
      while ( ci . hasMoreTokens ( ) ) {
        int k = Integer . parseInt ( ci . nextToken ( ) ) ;
        int v = Integer . parseInt ( ci . nextToken ( ) ) ;
        d [ k ] = v ;
      }
      p [ m ] = d ;
    }
    boolean ok = true ;
    boolean cont = true ;
    while ( cont ) {
      cont = false ;
      for ( int n = 1 ;
      n <= N ;
      n ++ ) {
        for ( int m = 0 ;
        m < M ;
        m ++ ) {
          if ( ( p [ m ] . length == 1 ) && ( p [ m ] [ n ] == 1 ) ) {
            if ( ( r [ n - 1 ] == 0 ) ) cont = true ;
            r [ n - 1 ] = 1 ;
            for ( int w = 0 ;
            w < M ;
            w ++ ) {
              if ( ( p [ w ] . length == 1 ) && ( p [ w ] [ n ] == 0 ) ) {
                -- p [ w ] [ n ] ;
              }
              if ( p [ w ] . length == 0 ) {
                ok = false ;
                break ;
              }
            }
            if ( ! ok ) break ;
          }
        }
        if ( ! ok ) break ;
      }
    }
    if ( ok ) System . out . println ( "Case #" + c + ": " + Arrays . toString ( r ) ) ;
    else System . out . println ( "Case #" + c + ": IMPOSSIBLE" ) ;
  }
  return i ;
}
