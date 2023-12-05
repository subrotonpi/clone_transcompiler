static final String [ ] args ( String [ ] args ) {
  final String inputFileName ;
  final String outputFileName ;
  if ( args . length != 2 ) {
    System . err . println ( "usage: ./a.jar <input_file_name>" ) ;
    exit ( ) ;
  }
  inputFileName = args [ 0 ] ;
  if ( inputFileName . length ( ) > 3 ) {
    outputFileName = inputFileName . substring ( 0 , inputFileName . length ( ) - 3 ) + ".out" ;
  }
  else {
    outputFileName = inputFileName + ".out" ;
  }
  /* max min LR */
  if ( N == 0 ) {
    return new int [ ] {
      0 , 0 }
      ;
    }
    else if ( N % 2 == 0 ) {
      return new int [ ] {
        N / 2 , N / 2 - 1 }
        ;
      }
      /* solve the N and K */
      final int [ ] q = new int [ ] {
        - N }
        ;
        final HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
        map . put ( N , 1 ) ;
        while ( q . length > 0 ) {
          final int cur = - heapq . get ( q [ 0 ] ) ;
          final int count = map . get ( cur ) ;
          if ( K <= count ) {
            return maxMinLR ( cur ) ;
          }
          K -= count ;
          final int leftSpace = ( cur + 1 ) / 2 - 1 ;
          final int rightSpace = cur - 1 - leftSpace ;
          if ( map . containsKey ( leftSpace ) ) {
            map . put ( leftSpace , count ) ;
          }
          else {
            map . put ( leftSpace , count ) ;
            heapq . put ( q [ 0 ] , - leftSpace ) ;
          }
          if ( map . containsKey ( rightSpace ) ) {
            map . put ( rightSpace , count ) ;
          }
          else {
            map . put ( rightSpace , count ) ;
            heapq . put ( q [ 0 ] , - rightSpace ) ;
          }
        }
        final String [ ] results = new String [ N ] ;
        try {
          BufferedReader reader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
          int T = Integer . parseInt ( reader . readLine ( ) ) ;
          for ( int i = 0 ;
          i < xrange ( T ) ;
          i ++ ) {
            String line = reader . readLine ( ) ;
            final int N = Integer . parseInt ( line ) ;
            final int K = Integer . parseInt ( line ) ;
            