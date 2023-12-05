static final int [ ] getStdDev ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  double mi = 2 ;
  double ma = 2 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( ( mi % A [ i ] ) != 0 && ( ma % A [ i ] ) != 0 && ( ( mi / A [ i ] ) == ( ma / A [ i ] ) ) ) {
      res = - 1 ;
      break ;
    }
    mi = Math . ceil ( mi / A [ i ] ) * A [ i ] ;
    ma = Math . floor ( ma / A [ i ] ) * A [ i ] + A [ i ] - 1 ;
  }
  if ( res == - 1 ) {
    System . out . println ( res ) ;
  }
  else {
    System . out . println ( mi + " " + ma ) ;
  }
  return A ;
}
