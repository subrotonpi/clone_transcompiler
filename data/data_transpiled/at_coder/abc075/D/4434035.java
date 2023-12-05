public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Point [ ] points = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    points [ i ] = new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int answer = 10 * 19 ;
  List < Point > sortx = new ArrayList < Point > ( points ) ;
  Collections . sort ( sortx ) ;
  List < Integer > numberx = new ArrayList < Integer > ( ) ;
  numberx . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  for ( int left = 0 ;
  left < N - K + 1 ;
  left ++ ) {
    final int x1 = numberx . get ( left ) ;
    final int y1 = numberx . get ( left + 1 ) ;
    for ( int right = left + K - 1 ;
    right < N ;
    right ++ ) {
      final int x2 = numberx . get ( left + 1 ) ;
      final int y2 = numberx . get ( right + 1 ) ;
      final int dx = x2 - x1 ;
      final List < Integer > sorty = new ArrayList < Integer > ( ) ;
      for ( int x = left , y = sortx . get ( x ) ;
      y < y ;
      y ++ ) {
        final int y3 = sorty . get ( x ) ;
        final int y4 = sorty . get ( y ) ;
        if ( y3 <= y1 && y3 <= y2 && y4 >= y1 && y4 >= y2 ) {
          answer = Math . min ( answer , dx * ( y4 - y3 ) ) ;
        }
      }
    }
  }
  System . out . println ( answer ) ;
  return answer ;
}
