@ VisibleForTesting static String input ( ) {
  int X = Integer . parseInt ( input ( ) ) ;
  int Y = Integer . parseInt ( input ( ) ) ;
  int [ ] N = ( 2 * X / Y == 0 ) ? new int [ ] {
    2 * X / Y , 2 * X / Y + 1 }
    : new int [ ] {
      Integer . parseInt ( input ( ) ) - 1 , Integer . parseInt ( input ( ) ) }
      ;
      int [ ] M = N . length > 1 ? new int [ ] {
        n * ( n + 1 ) / 2 - n * X / Y }
        : 0 ;
        String ans = ( Arrays . binarySearch ( M , N ) <= 0 || M [ 0 ] > n ) ? "Impossible" : "\n" + ans ;
        return ans ;
      }
      