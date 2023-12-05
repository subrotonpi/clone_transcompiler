@ VisibleForTesting static int LIS ( List < Integer > L ) {
  List < Integer > list = new ArrayList < > ( ) ;
  for ( int i : L ) {
    int pos = Collections . binarySearch ( list , i ) ;
    if ( list . size ( ) <= pos ) {
      list . add ( i ) ;
    }
    else {
      list . set ( pos , i ) ;
    }
  }
  return list . size ( ) ;
}
final int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
final int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
final int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
final int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
final int N = Integer . parseInt ( input . nextLine ( ) ) ;
final int W = Math . abs ( x2 - x1 ) ;
final int H = Math . abs ( y2 - y1 ) ;
final int xsgn = 2 * ( x2 > x1 ? x1 : x2 ) - 1 ;
final int ysgn = 2 * ( y2 > y1 ? y1 : y2 ) - 1 ;
final int [ ] [ ] XY = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  final int x = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( x - x1 ) * ( x - x2 ) <= 0 && ( y - y1 ) * ( y - y2 ) <= 0 ) {
    XY [ i ] [ 0 ] = xsgn * ( x - x1 ) ;
    XY [ i ] [ 1 ] = ysgn * ( y - y1 ) ;
  }
}
final double short = 20 - 5 * Math . PI ;
final double long = 10 * Math . PI - 20 ;
final int straight = 100 * ( W + H ) ;
Arrays . sort ( XY ) ;
final int [ ] Y = new int [ XY . length ] ;
for ( int i = 0 ;
i < Y . length ;
i ++ ) {
  Y [ i ] = XY [ i ] [ 0 ] ;
}
int fountain = LIS ( Y ) ;
if ( fountain < Math . min ( W , H ) + 1 ) {
  System . out . println ( straight - short * fountain ) ;
}
else {
  System . out . println ( straight - short * ( fountain - 1