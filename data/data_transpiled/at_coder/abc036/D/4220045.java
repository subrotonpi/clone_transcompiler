static final int [ ] [ ] G ( ) {
  int [ ] [ ] result = new int [ N ] [ ] ;
  System . arraycopy ( input , 0 , result , 0 , N ) ;
  System . arraycopy ( input , 0 , result , N , input . length ) ;
  int N = result [ N ] ;
  graph = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) graph [ i ] = new int [ N ] ;
  int [ ] fdp = new int [ N ] ;
  int [ ] gdp = new int [ N ] ;
  int MOD = 10 * 9 + 7 ;
  {
    if ( fdp [ i ] != - 1 ) {
      return fdp [ i ] ;
    }
    int p = graph [ i ] [ 0 ] ;
    fdp [ i ] = ( p + 1 ) % MOD ;
  }
}
