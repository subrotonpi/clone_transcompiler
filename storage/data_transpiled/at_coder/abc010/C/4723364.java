static final String getSummarine ( ) {
  final List < Integer > li = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    li . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final int x1 = li . get ( 0 ) ;
  final int y1 = li . get ( 1 ) ;
  final int x2 = li . get ( 2 ) ;
  final int y2 = li . get ( 3 ) ;
  final int t = li . get ( 4 ) ;
  final int v = li . get ( 5 ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] x = new int [ n ] ;
  final int [ ] y = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] = a ;
    y [ i ] = b ;
  }
  final double border = t * v ;
  String ans = "NO" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final double dis1 = Math . sqrt ( ( x [ i ] - x1 ) * ( x [ i ] - x1 ) + ( y [ i ] - y1 ) * ( y [ i ] - y1 ) ) ;
    final double dis2 = Math . sqrt ( ( x [ i ] - x2 ) * ( x [ i ] - x2 ) + ( y [ i ] - y2 ) * ( y [ i ] - y2 ) ) ;
    if ( border >= dis1 + dis2 ) {
      ans = "YES" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
