public static final int [ ] [ ] getStrings ( ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int caseno = 0 ;
  caseno < t ;
  caseno ++ ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    String [ ] strings = new String [ n ] ;
    char [ ] [ ] uc = new char [ n ] [ n ] ;
    int [ ] [ ] rep = new int [ n ] [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String myString = System . console ( ) . readLine ( ) . trim ( ) ;
      uc [ 0 ] = new char [ n ] ;
      rep [ 0 ] = new int [ n ] ;
      String last = "" ;
      for ( int i = 0 ;
      i < myString . length ( ) ;
      i ++ ) {
        if ( myString . charAt ( i ) == last ) {
          rep [ -- i ] [ i ] ++ ;
        }
        else {
          uc [ -- i ] [ i ] = myString . charAt ( i ) ;
          rep [ -- i ] [ i ] = 1 ;
          last = myString . charAt ( i ) ;
        }
      }
    }
    boolean possible = true ;
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      if ( uc [ 0 ] != uc [ j ] ) possible = false ;
    }
    if ( possible ) {
      int moves = 0 ;
      for ( int ltr = 0 ;
      ltr < n ;
      ltr ++ ) {
        int [ ] vals = new int [ n ] ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) vals [ j ] = rep [ j ] [ ltr ] ;
        int fewest = 99999999999 ;
        for ( int ct = 0 ;
        ct < Math . min ( vals . length , Math . max ( vals . length , vals . length ) + 1 ) ;
        ct ++ ) {
          int movesthisct = 0 ;
          for ( int v : vals ) movesthisct += Math . abs ( v - ct ) ;
          if ( movesthisct < fewest ) fewest = movesthisct ;
        }
        moves += fewest ;
      }
      System . out . print ( "Case #" + Integer . toString ( caseno + 1 ) + ": " + Integer . toString ( moves ) ) ;
    }
    else {
      System . out . print ( "Case #" +