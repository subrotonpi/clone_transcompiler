@ GwtIncompatible ( "java.util.concurrent.atomic.solve" ) private static String solve ( ) throws IOException {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  M = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    M [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) - 1 ;
  }
  E = new boolean [ N ] [ N ] ;
  R = new boolean [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M [ i ] . length ;
    j ++ ) {
      E [ i ] [ j ] = true ;
      R [ j ] [ i ] = true ;
    }
  }
  List < Integer > L = new LinkedList < Integer > ( ) ;
  List < Integer > S = new ArrayList < Integer > ( ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    S . add ( j ) ;
  }
  while ( ( S . size ( ) > 0 ) && ( S . size ( ) > 0 ) ) {
    int i = S . remove ( S . size ( ) - 1 ) ;
    L . add ( i ) ;
    for ( int j = 0 ;
    j < E [ i ] . length ;
    j ++ ) {
      R . remove ( R [ j ] [ i ] ) ;
      if ( R [ j ] . size ( ) == 0 ) {
        S . add ( j ) ;
      }
    }
  }
  int [ ] [ ] paths = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    paths [ i ] = R . size ( ) ;
  }
  R = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M [ i ] . length ;
    j ++ ) {
      R [ j ] [ i ] = M [ i ] [ j ] ;
    }
  }
  for ( int j = 0 ;
  j < L . size ( ) ;
  j ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = R [ j ] [ i ] ? 1 : 0 ;
      paths [ i ] [ j ] = x + Integer . valueOf ( paths [ i ] [ j ] ) ;
      if ( paths [ i ] [ j ] > 1 ) {
        