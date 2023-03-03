public static void main ( String [ ] args ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int ci = 0 ;
  ci < T ;
  ci ++ ) {
    int N = Integer . parseInt ( in . readLine ( ) ) ;
    int [ ] [ ] g = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      g [ i ] = new int [ N ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      g [ i ] = Integer . parseInt ( in . readLine ( ) ) ;
    }
    Set < Integer > ck = new HashSet < Integer > ( ) ;
    boolean solved = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Set < Integer > cg = new HashSet < Integer > ( ) ;
      List < Integer > cl = new ArrayList < Integer > ( ) ;
      if ( ! ck . contains ( i + 1 ) ) {
        ck . add ( i + 1 ) ;
        cg . add ( i + 1 ) ;
        cl . add ( i + 1 ) ;
        while ( cl . size ( ) > 0 && ! solved ) {
          int c = cl . remove ( 0 ) ;
          if ( g [ c - 1 ] [ 0 ] != 0 ) {
            for ( int j = c - 1 ;
            j < g [ c - 1 ] . length ;
            j ++ ) {
              if ( cg . contains ( g [ j ] [ 0 ] ) ) {
                solved = true ;
                break ;
              }
              else {
                ck . add ( j ) ;
                cg . add ( g [ j ] [ 0 ] ) ;
                cl . add ( j ) ;
              }
            }
          }
        }
        if ( solved ) break ;
      }
    }
    System . out . print ( "Case #" + ( ci + 1 ) + ":" ) ;
    if ( solved ) System . out . println ( "Yes" ) ;
    else System . out . println ( "No" ) ;
  }
}
