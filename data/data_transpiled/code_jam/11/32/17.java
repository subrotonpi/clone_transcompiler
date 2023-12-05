static String process ( String data ) throws IOException {
  StringTokenizer st = new StringTokenizer ( data ) ;
  L = Integer . parseInt ( st . nextToken ( ) ) ;
  t = Integer . parseInt ( st . nextToken ( ) ) ;
  N = Integer . parseInt ( st . nextToken ( ) ) ;
  C = Integer . parseInt ( st . nextToken ( ) ) ;
  int [ ] C_vals = new int [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) C_vals [ i ] = Integer . parseInt ( st . nextToken ( ) ) ;
  int [ ] stars = new int [ N ] ;
  int loc = 0 ;
  int index = 0 ;
  double [ ] distances = new double [ N ] ;
  double [ ] times = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    loc += C_vals [ index ] ;
    stars [ i ] = loc ;
    distances [ i ] = C_vals [ index ] ;
    times [ i ] = ( double ) loc / 0.5 ;
    index ++ ;
    if ( ( index == C ) && ( index == 0 ) ) index = 0 ;
  }
  double maxTime = ( double ) loc / 0.5 ;
  double dbuild = ( double ) t * 0.5 ;
  index = 0 ;
  while ( index < stars . length ) {
    if ( ( stars [ index ] < dbuild ) && ( stars [ index ] > dbuild ) ) distances [ index ] = - 1 ;
    else {
      if ( ( index == 0 ) && ( stars [ index ] > dbuild ) ) {
        distances [ index ] -= dbuild ;
      }
      else {
        dbuild -= stars [ index - 1 ] ;
        distances [ index ] -= dbuild ;
      }
      break ;
    }
    index ++ ;
  }
  Arrays . sort ( distances ) ;
  Arrays . reverse ( distances ) ;
  double maxSum = 0 ;
  if ( ( L < distances . length ) && ( distances [ L ] < dbuild ) ) {
    for ( int i = 0 ;
    i < L ;
    i ++ ) {
      if ( ( distances [ i ] == - 1 ) && ( times [ i ] > maxSum ) ) break ;
      maxSum += distances [ i ] ;
    }
  }
  else {
    for ( double distance : distances ) {
      if ( ( distance == - 1 ) && ( times [ i ] > maxSum ) ) break ;
      maxSum += distance ;
    }
  }
  maxTime -= maxSum ;
  return String . valueOf ( ( int ) maxTime ) ;
}
