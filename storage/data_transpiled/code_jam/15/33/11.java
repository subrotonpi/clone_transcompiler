public static int T = Integer . parseInt ( Scanner in ) {
  for ( int testcase = 0 ;
  testcase < T ;
  testcase ++ ) {
    Arrays . stream ( in . nextLine ( ) . split ( " " ) ) . map ( c -> Integer . parseInt ( in . nextLine ( ) ) ) . forEach ( d -> {
      int v = in . nextInt ( ) ;
      List < Integer > oldDenominations = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < v ;
      i ++ ) {
        oldDenominations . add ( Integer . parseInt ( in . nextLine ( ) ) ) ;
      }
      Collections . sort ( oldDenominations ) ;
      int cashMoneys = 0 ;
      List < Integer > newDenominations = new ArrayList < > ( ) ;
      while ( cashMoneys < v ) {
        if ( oldDenominations . isEmpty ( ) || oldDenominations . get ( 0 ) > cashMoneys + 1 ) {
          newDenominations . add ( cashMoneys + 1 ) ;
          cashMoneys += c * ( cashMoneys + 1 ) ;
        }
        else {
          while ( oldDenominations . size ( ) > 0 && oldDenominations . get ( 0 ) <= cashMoneys + 1 ) {
            cashMoneys += c * ( oldDenominations . get ( 0 ) ) ;
            oldDenominations . remove ( 0 ) ;
          }
        }
      }
      System . out . println ( "Case #" + ( testcase + 1 ) + ": " + newDenominations . size ( ) ) ;
    }
    ) ;
  }
  return T ;
}
