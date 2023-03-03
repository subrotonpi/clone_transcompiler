static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final NumberParser ni = new NumberParser ( ns ) ;
  final NumberParser nm = new NumberParser ( ni ) ;
  final NumberParser nl = new NumberParser ( nl ) ;
  final NumberParser nsl = new NumberParser ( nsl ) ;
  final int n = nm . nextInt ( ) ;
  final int m = nm . nextInt ( ) ;
  final int [ ] [ ] lis = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) lis [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  ++ i ) lis [ i ] [ 0 ] = lis [ i ] [ 1 ] ;
  visited [ 0 ] = 1 ;
  return new Scanner ( ) ;
}
