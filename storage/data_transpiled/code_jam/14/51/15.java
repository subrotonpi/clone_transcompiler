public static double getProbability ( Scanner in ) {
  int n = in . nextInt ( ) ;
  for ( int testcase = 0 ;
  testcase < n ;
  testcase ++ ) {
    Arrays . stream ( in . nextLine ( ) . split ( " " ) ) . forEach ( x -> {
      int N = in . nextInt ( ) ;
      int p = in . nextInt ( ) ;
      int q = in . nextInt ( ) ;
      int r = in . nextInt ( ) ;
      int s = in . nextInt ( ) ;
      int [ ] transistors = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        transistors [ i ] = ( i * p + q ) % r + s ;
      }
      int transistorsum = Arrays . stream ( transistors ) . mapToInt ( i -> i ) . sum ( ) ;
      int first = 0 ;
      int last = N ;
      int firstsum = 0 ;
      int lastsum = 0 ;
      double minimax = transistorsum ;
      while ( last - first != 1 ) {
        int nextfirstsum = firstsum + transistors [ first ] ;
        int nextlastsum = lastsum + transistors [ last - 1 ] ;
        if ( nextfirstsum < nextlastsum ) {
          firstsum += transistors [ first ] ;
          first ++ ;
        }
        else {
          last -- ;
          lastsum += transistors [ last ] ;
        }
        int currentmax = Math . max ( firstsum , lastsum , transistorsum - firstsum - lastsum ) ;
        minimax = Math . min ( currentmax , minimax ) ;
      }
      double answer = ( double ) ( transistorsum - minimax ) / ( double ) transistorsum ;
      System . out . println ( "Case #" + ( testcase + 1 ) + ": " + answer + " " + answer ) ;
    }
    ) ;
  }
  return 0.0 ;
}
