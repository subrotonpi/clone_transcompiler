@ Sys public static void main ( String [ ] args ) throws IOException {
  /* read from the input */
  String strLine = "" ;
  /* read from the input */
  String tmpBasin = new String ( ) ;
  /* read from the input */
  String strLine = "" ;
  /* read from the output */
  BufferedReader rsBufferedReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  /* read the input */
  String line = null ;
  /* read from the output */
  while ( ( line = rsBufferedReader . readLine ( ) ) != null ) {
    /* read from the input */
    int H = Integer . parseInt ( line ) ;
    /* read from the output */
    int W = Integer . parseInt ( line ) ;
    /* print the field */
    for ( int row = 0 ;
    row <= H ;
    row ++ ) {
      for ( int col = 0 ;
      col <= W ;
      col ++ ) {
        /* print the field */
        field = new TreeMap < Integer , Integer > ( ) ;
        /* print the field */
        int val = 100000 ;
        for ( int row = 0 ;
        row <= H ;
        row ++ ) {
          for ( int col = 0 ;
          col <= W ;
          col ++ ) {
            val = Integer . parseInt ( line ) ;
            /* print the field */
            arrows [ row ] [ col ] = Math . min ( ( field . get ( row - 1 , col ) ) , 1 ) ;
            /* print the field */
            if ( val >= field . get ( row , col ) ) {
              /* print the field */
              val = 0 ;
            }
          }
        }
        /* print the field */
        result = new TreeMap < Integer , String > ( ) ;
        char nextBasin = 'a' ;
        for ( int row = 0 ;
        row <= H ;
        row ++ ) {
          for ( int col = 0 ;
          col <= W ;
          col ++ ) {
            path = new ArrayList < Integer > ( ) ;
            path . add ( new Integer ( row ) ) ;
            while ( result . get ( path . size ( ) - 1 ) . equals ( " " ) && arrows [ path . size ( ) - 1 ] != 0 ) {
              int crow = path . get ( path . size ( ) - 1 ) ;
              if ( arrows [ crow ]