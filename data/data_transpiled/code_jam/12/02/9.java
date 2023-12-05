{
  return new int [ ] {
    0 , 0 , 0 }
    , new int [ ] {
      0 , 0 , 1 }
      , new int [ ] {
        0 , 1 , 1 }
        ;
      }
      final int [ ] surpModifiers = {
        {
          - 1 , 0 , 1 }
          , new int [ ] {
            - 1 , 1 , 1 }
            , new int [ ] {
              0 , 0 , 2 }
              ;
            }
            public static int solvecase ( int target , int surprising , int [ ] values ) {
              int totalDullCount = 0 ;
              int [ ] surpDeltas = new int [ values . length ] ;
              for ( int v : values ) {
                int [ ] dullScores = new int [ 3 ] ;
                for ( int m : dullModifiers [ v % 3 ] ) {
                  dullScores [ v / 3 ] = ( v / 3 ) + m ;
                }
                int [ ] surpScores = new int [ 3 ] ;
                for ( int m : surpModifiers [ v % 3 ] ) {
                  surpScores [ v / 3 ] = ( v / 3 ) + m ;
                }
                int dullCount = ( int ) Boolean . valueOf ( Arrays . binarySearch ( dullScores , target ) >= 0 ) ;
                int surpCount = ( int ) Boolean . valueOf ( Arrays . binarySearch ( surpScores , target ) >= 0 ) ;
                totalDullCount += dullCount ;
                if ( ArrayUtils . isEmpty ( surpScores ) || surpCount > 10 ) {
                  continue ;
                }
                surpDeltas [ v ] = surpCount - dullCount ;
              }
              Arrays . sort ( surpDeltas ) ;
              int count = totalDullCount + ( surprising > 0 ? Arrays . binarySearch ( surpDeltas , surpDeltas . length - surprising ) : 0 ) ;
              return count ;
            }
            public static void main ( String [ ] args ) {
              int cases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
              for ( int c = 0 ;
              c < cases ;
              c ++ ) {
                int [ ] values = ArrayUtil . toIntArray ( System . console ( ) . readLine ( ) . split ( " " ) ) ;
                int surprising = values [ 1 ] ;
                int target = values [ 2 ] ;
                int [ ] totals = values [ 3 ] ;
                int count = solvecase ( target , surprising , totals ) ;
                System . out . println ( "Case #"