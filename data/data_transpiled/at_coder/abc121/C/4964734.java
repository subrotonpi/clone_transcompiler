static final int [ ] [ ] solve ( ) {
  int n , m ;
  n = input . nextInt ( ) ;
  m = Integer . parseInt ( m ) ;
  a = new int [ n ] [ ] ;
  i = n = c = 0 ;
  a = new ArrayList < Integer > ( ) ;
  for ( int e : System . in ) {
    a . add ( e ) ;
  }
  while ( m > 0 ) c += a [ i ] [ 0 ] ;
  return a ;
}
