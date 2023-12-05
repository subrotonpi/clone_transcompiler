static final String [ ] status = {
  "NO" , "YES" }
  ;
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < cases ;
  testCase ++ ) {
    String [ ] lawnsize = in . readLine ( ) . split ( " " ) ;
    int rows = Integer . parseInt ( lawnsize [ 0 ] ) ;
    int columns = Integer . parseInt ( lawnsize [ 1 ] ) ;
    int [ ] [ ] lawn = new int [ rows ] [ columns ] ;
    for ( int r = 0 ;
    r < rows ;
    r ++ ) {
      int [ ] lawnrow = new int [ columns ] ;
      String [ ] rowdata = in . readLine ( ) . split ( " " ) ;
      for ( int c = 0 ;
      c < columns ;
      c ++ ) {
        lawnrow [ c ] = Integer . parseInt ( rowdata [ c ] ) ;
      }
      lawn [ r ] = lawnrow ;
    }
    int [ ] rowHeights = new int [ rows ] ;
    int [ ] colHeights = new int [ columns ] ;
    for ( int r = 0 ;
    r < rows ;
    r ++ ) {
      rowHeights [ r ] = Math . max ( lawn [ r ] [ c ] , 0 ) ;
    }
    for ( int c = 0 ;
    c < columns ;
    c ++ ) {
      int cmax = 0 ;
      for ( int r = 0 ;
      r < rows ;
      r ++ ) {
        if ( lawn [ r ] [ c ] > cmax ) {
          cmax = lawn [ r ] [ c ] ;
        }
      }
      colHeights [ c ] = cmax ;
    }
    int ok = 1 ;
    for ( int r = 0 ;
    r < rows ;
    r ++ ) {
      for ( int c = 0 ;
      c < columns ;
      c ++ ) {
        if ( lawn [ r ] [ c ] != Math . min ( rowHeights [ r ] , colHeights [ c ] ) ) {
          ok = 0 ;
          break ;
        }
      }
      if ( ok == 0 ) {
        break ;
      }
    }
    System . out . println ( "Case #" + Integer . toString ( testCase + 1 ) + ": " + status [ ok ] ) ;
    return null ;
  }
  