@ Parameterized . Parameters public static Collection < Object [ ] > winners = new ArrayList < > ( ) {
  {
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      winners . add ( new Object [ ] {
        new Integer ( i ) , new Integer ( 0 ) , new Integer ( i ) , new Integer ( 1 ) , new Integer ( 2 ) , new Integer ( 3 ) }
        ) ;
        winners . add ( new Object [ ] {
          new Integer ( 0 ) , new Integer ( i ) , new Integer ( 1 ) , new Integer ( 2 ) , new Integer ( 3 ) }
          ) ;
        }
      }
      {
        winners . add ( new Object [ ] {
          new Integer ( 0 ) , new Integer ( 1 ) , new Integer ( 2 ) , new Integer ( 3 ) }
          ) ;
          winners . add ( new Object [ ] {
            new Integer ( 3 ) , new Integer ( 0 ) , new Integer ( 2 ) , new Integer ( 1 ) , new Integer ( 2 ) , new Integer ( 0 ) , new Integer ( 3 ) }
            ) ;
          }
          private static boolean isWinning ( String [ ] [ ] board , String player , List < List < Integer >> winner ) {
            for ( List < Integer > spot : winner ) {
              if ( ! board [ spot . get ( 0 ) ] [ spot . get ( 1 ) ] . equals ( player ) && ! board [ spot . get ( 2 ) ] [ spot . get ( 3 ) ] . equals ( player ) && ! board [ spot . get ( 3 ) ] [ spot . get ( 4 ) ] . equals ( player ) && ! board [ spot . get ( 5 ) ] [ spot . get ( 6 ) ] . equals ( "T" ) ) {
                return false ;
              }
            }
            return true ;
          }
          private static String getStatus ( String [ ] [ ] board ) {
            for ( List < Integer > winner : winners ) {
              for ( String player : Arrays . asList ( "X" , "O" ) ) {
                if ( isWinning ( board , player , winner ) ) {
                  return player + " won" ;
                }
              }
            }
            if ( StringUtils . isEmpty ( board ) ) {
              return "Game has not completed" ;
            }
            return "Draw" ;
          }
          @ Override public int cases ( ) {
            return input . nextInt ( ) ;
          }
        }
        