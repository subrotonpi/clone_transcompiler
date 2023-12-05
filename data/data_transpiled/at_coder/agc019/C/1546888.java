public static int LIS ( int N , float [ ] a , int H ) {
  int [ ] dp = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    dp [ Arrays . binarySearch ( dp , a [ i ] ) ] = i ;
  }
  return Arrays . binarySearch ( dp , H ) ;
}
final int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
final int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
final int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
final int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
N = Integer . parseInt ( input . nextLine ( ) ) ;
final int W = Math . abs ( x2 - x1 ) ;
final int H = Math . abs ( y2 - y1 ) ;
final int xsgn = 2 * ( x2 > x1 ? x1 : x2 ) - 1 ;
final int ysgn = 2 * ( y2 > y1 ? y1 : y2 ) - 1 ;
int [ ] [ ] XY = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( x - x1 ) * ( x - x2 ) <= 0 && ( y - y1 ) * ( y - y2 ) <= 0 ) {
    XY [ i ] [ 0 ] = xsgn * ( x - x1 ) ;
    XY [ i ] [ 1 ] = ysgn * ( y - y1 ) ;
  }
}
final int N = XY . length ;
final int short = 20 - 5 * Math . PI ;
final int long = 10 * Math . PI - 20 ;
final int straight = 100 * ( W + H ) ;
@ SuppressWarnings ( "unused" ) int [ ] Y = new int [ N ] ;
for ( int i = 0 ;
i < Y . length ;
i ++ ) {
  Y [ i ] = XY [ i ] [ 0 ] ;
}
int fountain = LIS ( N , Y , H ) ;
if ( fountain < Math . min ( W , H ) + 1 ) {
  System . out . println ( straight - short * fountain ) ;
}
else {
  System . out . println ( straight - short * ( fountain - 1 ) + long ) ;
  