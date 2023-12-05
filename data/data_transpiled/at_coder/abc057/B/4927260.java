public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] init = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    init [ i ] = new int [ b ] ;
  }
  final int [ ] [ ] check = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int c = Integer . parseInt ( input . nextLine ( ) ) ;
    final int d = Integer . parseInt ( input . nextLine ( ) ) ;
    check [ i ] = new int [ c ] ;
    for ( int j = 0 ;
    j < d ;
    j ++ ) {
      final int [ ] [ ] i = init [ i ] ;
      int pos = 0 ;
      int dist = 10 * 9 ;
      final int x0 = i [ 0 ] ;
      final int y0 = i [ 1 ] ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        final int x1 = check [ j ] [ 0 ] ;
        final int y1 = check [ j ] [ 1 ] ;
        if ( Math . abs ( x0 - x1 ) + Math . abs ( y0 - y1 ) < dist ) {
          pos = j + 1 ;
          dist = Math . abs ( x0 - x1 ) + Math . abs ( y0 - y1 ) ;
        }
      }
      System . out . println ( pos ) ;
    }
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
}
