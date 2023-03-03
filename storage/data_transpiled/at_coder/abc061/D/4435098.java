static final void solve ( ) {
  System . setIn ( new BufferedReader ( new InputStreamReader ( System . in ) ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int abc [ ] [ ] = new int [ M ] [ N ] ;
  for ( int j = 0 ;
  j < M ;
  ++ j ) {
    abc [ j ] [ 0 ] = Integer . parseInt ( input ) ;
  }
  int [ ] [ ] con = new int [ N + 1 ] [ N + 1 ] ;
  float inf = Float . POSITIVE_INFINITY ;
  float [ ] allcost = new float [ N + 1 ] ;
  allcost [ 1 ] = inf ;
  for ( int n = 1 ;
  n < N ;
  ++ n ) {
    for ( int edge = 0 ;
    edge < M ;
    ++ edge ) {
      a = abc [ edge ] ;
      b = con [ edge ] ;
      if ( allcost [ a ] + c > allcost [ b ] ) {
        neg [ b ] = true ;
      }
      if ( neg [ a ] == true ) {
        neg [ b ] = true ;
      }
    }
  }
  if ( neg [ N ] ) {
    System . out . println ( "inf" ) ;
    exit ( 0 ) ;
  }
}
