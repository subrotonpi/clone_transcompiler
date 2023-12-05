static final int [ ] [ ] getSortedArray ( ) {
  final int ALL = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] L = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] [ ] XY = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    XY [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final List < Integer > diff = new ArrayList < > ( ) ;
  diff . add ( 0 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    diff . add ( L [ i ] [ i ] - L [ i - 1 ] - 1 ) ;
  }
  final List < Integer > cumsum = Lists . newArrayList ( Iterables . accumulate ( diff ) ) ;
  for ( int i = 0 ;
  i < XY . length ;
  i ++ ) {
    int x = XY [ i ] [ 0 ] ;
    int y = XY [ i ] [ 1 ] ;
    int ans = N + Math . min ( x , L [ 0 ] - 1 ) + Math . min ( y , ALL - L [ i - 1 ] ) ;
    int i = Arrays . binarySearch ( diff , x + y ) ;
    ans += cumsum . get ( i - 1 ) + ( N - i ) * ( x + y ) ;
    System . out . println ( ans ) ;
  }
  return XY ;
}
