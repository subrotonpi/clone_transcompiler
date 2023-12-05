private static int getHits ( int attack , int total , int buff ) {
  int base = ( total - 1 ) / attack + 1 ;
  if ( buff == 0 ) {
    return base ;
  }
  for ( int i = 1 ;
  i <= total / buff ;
  i ++ ) {
    base = Math . min ( base , ( total - 1 ) / ( attack + i * buff ) + 1 + i ) ;
  }
  return base ;
}
