static final void solve ( ) throws IOException {
  psyco . full ( ) ;
  final String [ ] args = args . length ;
  if ( args . length != 2 ) {
    System . err . println ( "specify input file" ) ;
    exit ( ) ;
  }
  final long startTime = System . nanoTime ( ) ;
  final BufferedReader fin = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  final PrintWriter fout = new PrintWriter ( new FileWriter ( new File ( args [ 1 ] ) + ".out" ) ) ;
  final int [ ] COLORS = new int [ 256 ] ;
  final int [ ] a = new int [ COLORS . length ] ;
  for ( int i = 0 ;
  i < COLORS . length ;
  i ++ ) {
    COLORS [ i ] = i ;
  }
  final int [ ] c = COLORS [ 0 ] ;
  final int M = COLORS [ 1 ] ;
  final int N = COLORS . length ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = Math . max ( 0 , c [ i ] - M ) ;
  }
  final int [ ] [ ] cost = new int [ N + 1 ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int D = Integer . parseInt ( next ( fin ) ) ;
    int I = Integer . parseInt ( next ( fout ) ) ;
    int M = Integer . parseInt ( next ( fout ) ) ;
    final int N = Integer . parseInt ( next ( fout ) ) ;
    a = Integer . parseInt ( next ( fout ) ) ;
    assert a . length == N ;
    cost [ 0 ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cost [ i ] [ 0 ] = a [ i ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int c = 0 ;
    c < COLORS . length ;
    c ++ ) {
      int delCost = cost [ i ] [ 0 ] + D ;
      int changeCost = Math . abs ( a [ i ] - c ) + Math . min ( cost [ i ] [ Math . max ( 0 , c [ i ] - M ) ] , Math . min ( COLORS [ i ] . length , c [ i ] + M + 1 ) ) ;
      cost [ i + 1 ] [ c ] = Math . min ( delCost , changeCost ) ;
    }
    if ( M > 0 ) {
      naiveSmooth ( cost