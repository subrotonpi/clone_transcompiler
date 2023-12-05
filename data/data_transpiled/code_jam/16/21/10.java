@ VisibleForTesting static String from ( int t ) {
  for ( int t : xrange ( Integer . parseInt ( readLine ( ) ) ) ) {
    String dig [ ] = {
      "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
      ;
      int order [ ] = {
        0 , 2 , 6 , 7 , 5 , 4 , 1 , 8 , 9 , 3 }
        ;
        char od [ ] = {
          'Z' , 'W' , 'X' , 'S' , 'V' , 'U' , 'O' , 'G' , 'I' , 'R' }
          ;
          int cnt [ ] = new int [ order . length ] ;
          int ansd [ ] = new int [ dig . length ] ;
          StringBuffer ans = new StringBuffer ( ) ;
          for ( int j = 0 ;
          j < readLine ( ) . trim ( ) . length ( ) ;
          j ++ ) cnt [ j ] ++ ;
          for ( int ind = 0 , i = order . length ;
          ind < i ;
          ind ++ ) {
            ansd [ i ] = cnt [ od [ ind ] ] ;
            for ( int j = 0 ;
            j < dig [ i ] . length ( ) ;
            j ++ ) cnt [ dig [ i ] ] -= ansd [ i ] ;
          }
          for ( int i = 0 ;
          i < ansd . length ;
          i ++ ) ans . append ( i * ansd [ i ] ) ;
          System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
        }
        return "" ;
      }
      