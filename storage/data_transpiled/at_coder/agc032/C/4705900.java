public static int [ ] [ ] [ ] g ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] es = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] = Integer . valueOf ( input . readLine ( ) ) ;
  }
  int [ ] [ ] degs = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    es [ a ] [ 0 ] = Integer . valueOf ( input . readLine ( ) ) ;
    es [ a ] [ 1 ] = Integer . valueOf ( input . readLine ( ) ) ;
  }
  if ( ArrayUtils . contains ( degs , d -> d % 2 ) ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  if ( ArrayUtils . contains ( degs , d -> d >= 6 ) ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
  int fours = degs . length > 4 ? degs [ 4 ] [ 0 ] : 0 ;
  if ( fours <= 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  else if ( fours >= 3 ) {
    System . out . println ( "Yes" ) ;
    exit ( ) ;
  }
  assert fours == 2 ;
  int u = degs . length > 4 ? degs [ 4 ] [ 0 ] : 0 ;
  int v = degs [ u + 1 ] . length + u + 1 ;
  int [ ] [ ] [ ] g = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    g [ i ] = new int [ N ] ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      es [ a ] [ 0 ] = Integer . valueOf ( input . readLine ( ) ) ;
      es [ a ] [ 1 ] = Integer . valueOf ( input . readLine ( ) ) ;
    }
    for ( int b = 0 ;
    b < N ;
    b ++ ) {
      g [ b ] [ 0 ] [ 1 ] = Integer . valueOf ( input . readLine ( ) ) ;
    }
  }
  return g ;
}
