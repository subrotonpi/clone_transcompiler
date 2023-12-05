static final double nextDouble ( ) {
  int n = ( int ) input . nextDouble ( ) ;
  int t = ( int ) ( Math . log10 ( n ) + 1 ) ;
  int s = ( n + 1 ) / ( 10 * * ( t - 1 ) ) ;
  return 9 * ( t - 1 ) + s - 1 ;
}
