@ VisibleForTesting static String solve ( ) throws IOException {
  final Scanner fin = new Scanner ( System . in ) ;
  final int n = Integer . parseInt ( readLine ( ) ) ;
  final PrintStream fout = new PrintStream ( "out" ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    System . out . println ( "Solving" + i ) ;
    fout . print ( "Case #" + i + ": " ) ;
    fout . print ( solve ( ) ) ;
    fout . println ( ) ;
  }
  final int [ ] [ ] coords = new int [ n ] [ 3 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    coords [ i ] = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      coords [ i ] [ j ] = ( x0 [ j ] + 1 ) % M ;
      x0 = ( A * x0 [ j ] + B ) % M ;
      y0 = ( C * y0 [ j ] + D ) % M ;
    }
  }
  final ArrayList < ArrayList < Integer >> modCnt = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        coords [ i ] [ j ] = ( coords [ i ] [ j ] + 1 ) % 3 ;
      }
    }
    for ( int i = n - 1 ;
    i >= 0 ;
    j -- ) {
      final ArrayList < Integer > res = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        res . add ( modCnt . get ( n - i - 1 ) . get ( j ) ) ;
        res . add ( coords [ i ] [ 0 ] % 3 ) ;
        res . add ( coords [ i ] [ 1 ] % 3 ) ;
        res . add ( modCnt . get ( i + 1 ) . get ( j ) ) ;
      }
      modCnt . add ( res ) ;
    }
  }
  modCnt . trimToSize ( ) ;
  final ArrayList < ArrayList < Integer >> modCnt2 = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int q1 = 0 ;
    q1 < 3 ;
    q1 ++ ) {
      for ( int q2 = 0 ;
      q2