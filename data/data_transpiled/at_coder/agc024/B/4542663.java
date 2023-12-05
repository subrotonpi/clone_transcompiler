static final int [ ] getMath ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = input . nextInt ( ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = input . nextInt ( ) - 1 ;
  int [ ] Q = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Q [ i ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Q [ A [ i ] ] = i ;
  int num = 0 ;
  int s = 1 ;
  int t = Q [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) Q [ A [ i ] ] = i ;
  num = 0 ;
  return Q ;
}
