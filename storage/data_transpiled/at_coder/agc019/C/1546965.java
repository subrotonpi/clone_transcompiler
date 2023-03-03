@ VisibleForTesting static int LIS ( List < Integer > L ) {
  List < Integer > best = new ArrayList < > ( ) ;
  for ( int i : L ) {
    int pos = Integer . compare ( i , best . get ( i ) ) ;
    if ( best . size ( ) <= pos ) {
      best . add ( i ) ;
    }
    else {
      best . set ( pos ) ;
    }
  }
  return best . size ( ) ;
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
final List < int [ ] > XY = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  final int x = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( x - x1 ) * ( x - x2 ) <= 0 && ( y - y1 ) * ( y - y2 ) <= 0 ) {
    XY . add ( new int [ ] {
      xsgn * ( x - x1 ) , ysgn * ( y - y1 ) }
      ) ;
    }
  }
  final int N = XY . size ( ) ;
  final double short = 20 - 5 * Math . PI ;
  final double long = 10 * Math . PI - 20 ;
  final double straight = 100 * ( W + H ) ;
  Collections . sort ( XY ) ;
  final int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y [ i ] = XY . get ( i ) ;
  }
  int fountain = LIS ( Y ) ;
  if ( fountain < Math . min ( W , H ) + 1 ) {
    System . out . println ( straight - short * fountain ) ;
  }
  else {
    System . out . println ( straight - short * ( fountain