@ org . junit . experimental . theories . DataPoints public static < T > memoized ( final Supplier < T > supplier ) {
  final Map < String , T > mem = new HashMap < > ( ) ;
  final Scanner in = new Scanner ( new File ( TASK + ".in" ) ) ;
  final PrintWriter out = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( new FileOutputStream ( TASK + ".out" ) , "UTF-8" ) ) ) ;
  final int cases = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int ncase = 0 ;
  ncase < cases ;
  ncase ++ ) {
    int X = ( Integer ) in . nextInt ( ) ;
    int W = ( Integer ) in . nextInt ( ) ;
    int R = ( Integer ) in . nextInt ( ) ;
    int t = ( Integer ) in . nextInt ( ) ;
    final int N = ( Integer ) in . nextInt ( ) ;
    final List < Pair < Integer , Integer >> parts = new ArrayList < > ( ) ;
    for ( int i = xrange ( N ) ;
    i < N ;
    i ++ ) {
      final int B = ( Integer ) in . nextInt ( ) ;
      final int E = ( Integer ) in . nextInt ( ) ;
      X -= E - B ;
      parts . add ( new Pair < > ( s , E - B ) ) ;
    }
    parts . add ( new Pair < > ( 0 , X ) ) ;
    Collections . sort ( parts ) ;
    int T = 0 ;
    for ( Pair < Integer , Integer > s : parts ) {
      int L = s . first ( ) ;
      if ( t > 0 ) {
        final int Tr = Math . min ( L / ( s . plus ( R ) ) , t ) ;
        T += Tr ;
        t -= Tr ;
        L -= ( s . plus ( R ) * Tr ) ;
      }
      if ( t == 0 ) {
        T += L / ( s . plus ( W ) ) ;
      }
    }
    out . println ( "Case #" + ( ncase + 1 ) + ": " + T ) ;
  }
  return mem ;
}
