static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    final int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
    for ( int index = 1 ;
    index <= T ;
    index ++ ) {
      final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
      final int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
      final int K = Integer . parseInt ( scanner . nextLine ( ) ) ;
      if ( Math . min ( N , M ) <= 2 ) {
        System . out . println ( "Case #" + index + ": " + K ) ;
      }
      else if ( Math . min ( N , M ) <= 3 ) {
        final int [ ] answer = {
          1 , 2 , 3 , 4 , 4 , 5 , 6 , 6 , 7 , 8 , 8 , 9 , 10 , 10 , 11 , 12 , 12 , 13 , 14 , 14 }
          ;
          if ( K > 3 * ( Math . max ( N , M ) - 1 ) ) {
            System . out . println ( "Case #" + index + ": " + ( answer [ 3 * ( Math . max ( N , M ) - 1 ) - 1 ] + K - 3 * ( Math . max ( N , M ) - 1 ) ) ) ;
          }
          else {
            System . out . println ( "Case #" + index + ": " + ( answer [ K - 1 ] ) ) ;
          }
        }
        else if ( Math . min ( N , M ) <= 4 ) {
          final int [ ] answer = {
            1 , 2 , 3 , 4 , 4 , 5 , 6 , 6 , 7 , 7 , 8 , 9 , 10 , 10 , 11 , 12 , 12 }
            ;
            if ( K > 4 * ( Math . max ( N , M ) - 1 ) ) {
              System . out . println ( "Case #" + index + ": " + ( answer [ 4 * ( Math . max ( N , M ) - 1 ) - 1 ] + K - 4 * ( Math . max ( N , M ) - 1 ) ) ) ;
            }
            else {
              System . out . println ( "Case #" + index + ": " + ( answer [ K - 1 ] ) ) ;
            }
          }
          return answer [ N - 1 ] ;
        }
      }
    }
    