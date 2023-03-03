static final String solve ( ) throws IOException {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int cases = Integer . parseInt ( stdin . readLine ( ) ) ;
  final Pattern solvedPattern = Pattern . compile ( rString ( ".*Value of objective function: ([0-9.e+]+)$" ) ) ;
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    final int p = Integer . parseInt ( stdin . readLine ( ) ) ;
    final List < Integer > misses = new ArrayList < > ( p - Integer . parseInt ( stdin . readLine ( ) ) ) ;
    assert misses . size ( ) == 1 << p ;
    final List < Integer > rounds = new ArrayList < > ( ) ;
    final StringBuilder lp = new StringBuilder ( "min:\n" ) ;
    for ( int i = 0 ;
    i < p ;
    i ++ ) {
      final int [ ] r = new int [ p ] ;
      for ( int j = 0 ;
      j < r . length ;
      j ++ ) {
        r [ j ] = Integer . parseInt ( stdin . readLine ( ) ) ;
      }
      rounds . add ( r ) ;
      for ( int j = 0 ;
      j < rounds . size ( ) ;
      j ++ ) {
        int cost = r [ j ] ;
        lp . append ( "\t" ) . append ( cost ) . append ( " * r" ) . append ( i ) . append ( j ) . append ( " + \n" ) ;
      }
    }
    lp . append ( "\t0;\n\n" ) ;
    for ( int i = 0 ;
    i < 1 << p ;
    i ++ ) {
      int v = i ;
      for ( int j = 0 ;
      j < rounds . size ( ) ;
      j ++ ) {
        v >>= 1 ;
        lp . append ( "r" ) . append ( j ) . append ( " + " ) ;
      }
      lp . append ( "0 >= " ) . append ( misses . get ( i ) ) . append ( ";\n" ) ;
    }
    lp . append ( "\n\n" ) ;
    for ( int i = 0 ;
    i < rounds . size ( ) ;
    i ++ ) {
      for ( int j = 0 ;
      j < rounds . size ( ) ;
      j ++ ) {
        lp . append ( "int r" ) . append ( i ) . append ( j ) ;
      }
    }
    final String result = ProcessTools . executeScript ( lp .