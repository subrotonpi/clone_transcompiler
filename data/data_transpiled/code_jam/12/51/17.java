static final void main ( String [ ] args ) {
  final int [ ] ints = new int [ 2 ] ;
  int i = 0 ;
  int b = 0 ;
  for ( int j : xrange ( ints . length ) ) {
    if ( ints [ j ] == 0 ) {
      continue ;
    }
    if ( b == 0 ) {
      b = j ;
      continue ;
    }
    if ( ints [ j ] > ints [ b ] ) {
      b = j ;
    }
  }
  /* Find the highest index of the array */
  final int [ ] order = new int [ ints . length ] ;
  for ( int j = 0 ;
  j < ints . length ;
  j ++ ) {
    order [ j ] = findFirstMax ( ints [ j ] , i ) ;
    order [ j ] = j ;
    ints [ j ] = null ;
  }
  /* Solve the problem */
  final File f = new File ( f . getPath ( ) ) ;
  final BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  String l = br . readLine ( ) ;
  br . close ( ) ;
  l = ArrayUtil . remove ( l , 0 , l . length ( ) - 1 ) ;
  final int numCases = Integer . parseInt ( l ) ;
  l = l . substring ( 1 ) ;
  for ( int j = xrange ( numCases ) ;
  j < ints . length ;
  j ++ ) {
    System . out . println ( l >> System . err ) ;
    System . out . println ( "Computing case " + ( j + 1 ) ) ;
    final int n = Integer . parseInt ( l . substring ( 0 , j ) ) ;
    final int ti = ArrayUtil . remove ( l . substring ( j + 1 ) , ti ) ;
    final int pi = ArrayUtil . remove ( l . substring ( j + 1 ) , pi ) ;
    l = l . substring ( 3 ) ;
    System . out . println ( "Case #" + ( j + 1 ) + ": " + solveIt ( ti , pi ) ) ;
  }
  /* Solve the problem */
  final String s = "Problem with " + s ;
  final int t = s . indexOf ( ' ' ) ;
  if ( t == - 1 ) {
    s = s . substring ( 0 , t ) ;
  }
  else if ( t == - 1 ) {
    s = s . substring ( 0 , t ) ;
  }
  else {
    assert false : s . startsWith ( t ) ;
  }
}
