static void maxFlow ( ) {
  int len = 0 ;
  int [ ] [ ] L = new int [ num ] [ len ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    L [ i ] [ i ] = 0 ;
  }
  int [ ] [ ] L [ ] = new int [ num ] [ len ] ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    L [ i ] [ i ] [ 0 ] = i ;
  }
  int [ ] [ ] G = new int [ N ] [ N ] ;
  int [ ] [ ] p = new int [ N ] [ N ] ;
  int [ ] [ ] ab = new int [ N ] [ E ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < G . length ;
  i ++ ) {
    G [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < E . length ;
  i ++ ) {
    ab [ i ] [ 1 ] = i ;
  }
  int T = N + 1 ;
  maxFlow ( T ) ;
  for ( int i = 0 ;
  i < ab . length ;
  i ++ ) {
    m . setLR ( ab [ i ] [ 0 ] , ab [ i ] [ 1 ] , 1 ) ;
  }
  m . setTn ( - 1 , p , 1 ) ;
  m . exe ( ) ;
  System . out . println ( m . getAns ( - 1 ) ) ;
}
