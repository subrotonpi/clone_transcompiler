static final String [ ] [ ] convertToBase ( int number , int base ) throws IOException {
  List < Integer > digits = new ArrayList < Integer > ( ) ;
  int mod = base ;
  int prevMod = 1 ;
  while ( number > 0 ) {
    int digit = ( number % mod ) / prevMod ;
    digits . add ( digit ) ;
    number = number - digit * prevMod ;
    prevMod = mod ;
    mod *= base ;
  }
  if ( digits . size ( ) == 0 ) {
    digits . clear ( ) ;
    digits . add ( 0 ) ;
  }
  return digits . toArray ( new Integer [ digits . size ( ) ] [ ] ) ;
}
