static final int [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ N ] ;
  int [ ] [ ] B = new int [ M ] [ N ] ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    A [ s ] [ s ] = input . nextInt ( ) ;
    B [ s ] [ s ] = input . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < N - M + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N - M + 1 ;
    j ++ ) {
    }
  }
  return A ;
}
