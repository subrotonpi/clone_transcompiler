public static int [ ] [ ] calScore ( char [ ] [ ] board ) {
  int dai = 0 ;
  int ko = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( board [ i ] [ j ] == board [ i + 1 ] [ j ] ) dai += b [ i ] [ j ] ;
      else ko += b [ i ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( board [ i ] [ j ] == board [ i ] [ j + 1 ] ) dai += c [ i ] [ j ] ;
      else ko += c [ i ] [ j ] ;
    }
  }
  return ( dai , ko ) ;
}
