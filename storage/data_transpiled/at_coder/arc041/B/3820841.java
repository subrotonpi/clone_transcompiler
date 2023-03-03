{
  return new int [ ] [ ] {
    {
      0 , 1 }
      , {
        1 , 0 }
        , {
          0 , - 1 }
          , {
            - 1 , 0 }
          }
          ;
        }
        N = Integer . parseInt ( input . nextLine ( ) ) ;
        M = Integer . parseInt ( input . nextLine ( ) ) ;
        List < List < Integer >> B = new ArrayList < > ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          B . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
        }
        List < Integer > C = new ArrayList < > ( ) ;
        for ( int i = 0 ;
        i < M ;
        i ++ ) {
          C . add ( new Integer [ ] {
            0 }
            ) ;
          }
          for ( int thisY = 1 ;
          thisY < N - 1 ;
          thisY ++ ) {
            for ( int thisX = 1 ;
            thisX < M - 1 ;
            thisX ++ ) {
              int minNum = 10 ;
              for ( int adX = 0 ;
              adX < ADJUSTS . length ;
              adX ++ ) {
                int adY = ADJUSTS [ adX ] ;
                int x = thisX + adX ;
                int y = thisY + adY ;
                minNum = Math . min ( minNum , B . get ( y ) . get ( x ) ) ;
              }
              for ( int adX = 0 ;
              adX < ADJUSTS . length ;
              adX ++ ) {
                int x = thisX + adX ;
                int y = thisY + adY ;
                B . get ( y ) . set ( x , minNum ) ;
              }
              C . set ( thisY , minNum ) ;
            }
          }
          for ( List < Integer > c : C ) {
            System . out . println ( Arrays . toString ( c ) ) ;
          }
          return new int [ ] {
            0 }
            ;
          }
          