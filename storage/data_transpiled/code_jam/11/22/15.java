static void read ( Scanner in ) throws Exception {
  int t = Integer . parseInt ( in . next ( ) ) ;
  for ( int i : xrange ( t ) ) {
    final List < Vendor > vendors = new ArrayList < > ( ) ;
    final int c = Integer . parseInt ( in . next ( ) . trim ( ) ) ;
    final int d = Integer . parseInt ( in . next ( ) . trim ( ) ) ;
    for ( int j : xrange ( c ) ) {
      final int p = Integer . parseInt ( in . next ( ) . trim ( ) ) ;
      final int v = Integer . parseInt ( in . next ( ) . trim ( ) ) ;
      vendors . add ( new Vendor ( p , v ) ) ;
    }
    read ( vendors , d ) ;
  }
  /* solve the number of vendors */
  double maxT = 0 ;
  for ( int i = xrange ( vendors . size ( ) ) ;
  i < vendors . size ( ) ;
  i ++ ) {
    for ( int j = xrange ( i , vendors . size ( ) ) ;
    j < vendors . size ( ) ;
    j ++ ) {
      int n = 0 ;
      for ( int p = i ;
      p < vendors . size ( ) && p < vendors . size ( ) ;
      p ++ ) n += vendors . get ( p ) . intValue ( ) ;
      final int left = vendors . get ( i ) . intValue ( ) ;
      final int right = vendors . get ( j ) . intValue ( ) ;
      if ( n <= 1 ) continue ;
      final double t = ( double ) ( distance * ( n - 1 ) - ( right - left ) ) / 2 ;
      if ( t > maxT ) maxT = t ;
    }
  }
  /* main the test */
  for ( int i = 0 ;
  i < vendors . size ( ) ;
  i ++ ) {
    final Vendor vendors = read ( vendors . get ( i ) , vendors . size ( ) ) ;
    final double t = solve ( vendors , distance ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + t ) ;
  }
  final String _input = "\n" + "2\n" + "3 2\n" + "0 1\n" + "3 2\n" + "6 1\n" + "2 2\n" + "0 3\n"