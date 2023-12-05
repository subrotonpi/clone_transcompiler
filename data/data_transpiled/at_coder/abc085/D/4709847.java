static final int [ ] getMath ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = x ;
    b [ i ] = y ;
  }
  int throw = 0 ;
  int throwCount = 0 ;
  int maxA = max ( a ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( b [ i ] < maxA ) break ;
    throw + = b [ i ] ;
  }
  return a ;
}
