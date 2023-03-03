static final int [ ] getSums ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sum += a [ i ] * b [ i ] ;
  }
  return a ;
}
