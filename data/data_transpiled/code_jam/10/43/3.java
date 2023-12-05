public static void main ( String [ ] args ) throws Exception {
  final Scanner input = new Scanner ( System . in ) ;
  /* Run main */
  final int MAXC = 105 ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int [ ] [ ] M = new int [ MAXC + 1 ] [ MAXC + 1 ] ;
    final int R = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      final int X1 = Integer . parseInt ( input . nextLine ( ) ) ;
      final int Y1 = Integer . parseInt ( input . nextLine ( ) ) ;
      final int X2 = Integer . parseInt ( input . nextLine ( ) ) ;
      final int Y2 = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int x = X1 ;
      x <= X2 ;
      x ++ ) {
        for ( int y = Y1 ;
        y <= Y2 ;
        y ++ ) {
          M [ x ] [ y ] = 1 ;
        }
      }
      int step = 0 ;
      boolean done = R == 0 ? true : false ;
      while ( ! done ) {
        done = true ;
        step ++ ;
        for ( int x = MAXC ;
        x >= 0 ;
        x -- ) {
          for ( int y = MAXC ;
          y >= 0 ;
          y -- ) {
            if ( M [ x ] [ y ] == 0 ) {
              if ( x >= 1 && y >= 1 && M [ x - 1 ] [ y ] && M [ x ] [ y - 1 ] ) {
                M [ x ] [ y ] = 1 ;
                done = false ;
              }
            }
            else {
              if ( ( x == 0 || M [ x - 1 ] [ y ] == 0 ) && ( y == 0 || M [ x ] [ y - 1 ] == 0 ) ) {
                M [ x ] [ y ] = 0 ;
              }
              else {
                done = false ;
              }
            }
            if ( ( x == MAXC || y == MAXC ) && M [ x ] [ y ] > 0 ) {
              throw new Exception ( "MAXC too small" ) ;
            }
          }
        }
      }
      System . out . println ( "Case #" + t + ": " + step ) ;
    }
  }
}
