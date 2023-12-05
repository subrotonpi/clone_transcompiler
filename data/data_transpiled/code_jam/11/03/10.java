static final String solve ( int [ ] bag ) throws IOException {
  System . out . println ( ">>> " + bag ) ;
  int total = 0 ;
  for ( int c : bag ) {
    total ^= c ;
  }
  if ( total != 0 ) {
    return - 1 ;
  }
  int minimum = min ( bag ) ;
  int suma = sum ( bag ) ;
  return suma - minimum ;
}
