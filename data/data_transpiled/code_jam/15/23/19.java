static final String main ( String ifn , String ofn ) throws IOException {
  final String solution ;
  final Scanner inf = new Scanner ( new File ( ifn ) ) ;
  final PrintWriter ouf = new PrintWriter ( new BufferedWriter ( new FileWriter ( ofn ) ) ) ;
  final int noc = Integer . parseInt ( inf . nextLine ( ) . trim ( ) ) ;
  for ( int tnoc = 0 ;
  tnoc < noc ;
  tnoc ++ ) {
    ouf . print ( "Case #" + ( tnoc + 1 ) + ": " ) ;
    final int i = Integer . parseInt ( inf . nextLine ( ) . trim ( ) ) ;
    final int [ ] L1 = new int [ i ] ;
    final int [ ] L2 = new int [ i ] ;
    final int [ ] L3 = new int [ i ] ;
    for ( int k = 0 ;
    k < i ;
    k ++ ) {
      final String [ ] a = inf . nextLine ( ) . trim ( ) . split ( "\\s+" ) ;
      L1 [ k ] = Integer . parseInt ( a [ 0 ] ) ;
      L2 [ k ] = Integer . parseInt ( a [ 1 ] ) ;
      L3 [ k ] = Integer . parseInt ( a [ 2 ] ) ;
    }
    final int N = Integer . parseInt ( L2 [ 0 ] ) ;
    final double [ ] goal = new double [ N ] ;
    for ( int k = 0 ;
    k < L1 . length ;
    k ++ ) {
      final int pos = L1 [ k ] ;
      for ( int j = 0 ;
      j < L2 [ k ] ;
      j ++ ) {
        final double v = ( double ) 360 / ( L3 [ k ] + j ) ;
        goal = goal . clone ( ) ;
        goal [ k ] = ( 360d - L1 [ k ] ) / v ;
      }
    }
    final int [ ] resultat = new int [ N ] ;
    for ( int t = 0 ;
    t < goal . length ;
    t ++ ) {
      int [ ] nbrtour = new int [ N ] ;
      for ( int k = 0 ;
      k < L1 . length ;
      k ++ ) {
        final int pos = L1 [ k ] ;
        for ( int j = 0 ;
        j < L2 [ k ] ;
        j ++ ) {
          final double v = ( double ) 360 / ( L3 [ k ] + j ) ;
          nbrtour = nbrtour . clone ( ) ;
        }
      }
      System . arraycopy ( nbrtour , 0 , resultat , 0