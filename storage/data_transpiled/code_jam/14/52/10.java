static final String solve ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  final PrintStream fout = new PrintStream ( "p2.out" ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int tt = xrange ( T ) ;
  tt < T ;
  tt ++ ) {
    print ( tt + 1 ) ;
    final int P = Integer . parseInt ( fin . readLine ( ) ) ;
    final int Q = Integer . parseInt ( fin . readLine ( ) ) ;
    final int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] h = new int [ N ] , g = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) h [ i ] = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) g [ i ] = Integer . parseInt ( fin . readLine ( ) ) ;
    print ( h , g ) ;
    int [ ] [ ] left = new int [ N + 1 ] [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        left [ i ] [ j ] = - 1 ;
      }
    }
    left [ 0 ] [ 0 ] = 0 ;
    left [ 0 ] [ 1 ] = 0 ;
    for ( int i = 1 ;
    i < N + 1 ;
    i ++ ) {
      int hits = ( h [ i - 1 ] - 1 ) / Q + 1 ;
      int need = ( h [ i - 1 ] - ( hits - 1 ) * Q - 1 ) / P + 1 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        left [ i ] [ j ] = left [ i - 1 ] [ Math . max ( j - hits , 0 ) ] ;
        if ( j + need >= hits - 1 && left [ i - 1 ] [ j + need - hits + 1 ] != - 1 ) left [ i ] [ j ] = Math . max ( left [ i ] [ j ] , left [ i - 1 ] [ j + need - hits + 1 ] + g [ i - 1 ] ) ;
      }
    }
    int ans = Math . max ( left [ N ] , 0 ) ;
    fout . println ( "Case #" + ( tt + 1 ) + ": " +