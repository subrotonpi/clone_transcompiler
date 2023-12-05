static final String getOutput ( ) {
  System . out . println ( "completed" ) ;
  int N = 0 ;
  int nn = 0 ;
  while ( N > 0 ) {
    N -= N & ( - N ) ;
    nn ++ ;
  }
  return "" ;
}
