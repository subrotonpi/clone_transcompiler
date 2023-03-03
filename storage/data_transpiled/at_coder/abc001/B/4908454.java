static final int input ( ) {
  int m = Integer . parseInt ( input ( ) ) ;
  int d = 0 ;
  if ( m < 100 ) {
    d = 0 ;
  }
  else if ( m <= 5000 ) {
    d = m / 100 ;
  }
  else if ( m <= 30000 ) {
    d = m / 1000 + 50 ;
  }
  else if ( m <= 70000 ) {
    d = m ;
  }
  return d ;
}
