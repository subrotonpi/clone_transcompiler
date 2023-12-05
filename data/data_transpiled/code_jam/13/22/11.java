static double C ( int k , int a ) {
  if ( a == 0 ) {
    return 1 ;
  }
  return Math . factorial ( k ) / ( Math . factorial ( a ) * Math . factorial ( k - a ) ) ;
}
