@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int T = Integer . parseInt ( input ) ;
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int mi = A [ 0 ] ;
  int s = 0 ;
  dd = new TreeMap < > ( ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    mi = Math . min ( mi , A [ i ] ) ;
    s = Math . max ( A [ i ] - mi , s ) ;
    dd [ A [ i ] - mi ] ++ ;
  }
  System . out . println ( dd [ s ] ) ;
}
