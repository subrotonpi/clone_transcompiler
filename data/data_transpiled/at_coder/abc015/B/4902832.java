static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int su = 0 ;
  int cnt = 0 ;
  for ( int i : a ) {
    if ( i != 0 ) {
      su += i ;
      cnt ++ ;
    }
  }
  System . out . println ( Math . ceil ( su / cnt ) ) ;
  return n ;
}
