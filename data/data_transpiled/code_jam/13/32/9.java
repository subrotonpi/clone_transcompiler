static final Scanner input = new Scanner ( System . in ) {
  final int testCaseNumber = 1 ;
  for ( int testCaseNumber = 1 ;
  testCaseNumber < testCaseNumber ;
  testCaseNumber ++ ) {
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    int Y = Integer . parseInt ( input . nextLine ( ) ) ;
    StringBuffer result = new StringBuffer ( ) ;
    if ( X > 0 ) {
      for ( int i = 0 ;
      i < X ;
      i ++ ) {
        result . append ( "WE" ) ;
      }
    }
    else if ( X < 0 ) {
      for ( int i = 0 ;
      i < ( int ) Math . abs ( X ) ;
      i ++ ) {
        result . append ( "EW" ) ;
      }
    }
    if ( Y > 0 ) {
      for ( int i = 0 ;
      i < Y ;
      i ++ ) {
        result . append ( "SN" ) ;
      }
    }
    else if ( Y < 0 ) {
      for ( int i = 0 ;
      i < ( int ) Math . abs ( Y ) ;
      i ++ ) {
        result . append ( "NS" ) ;
      }
    }
    System . out . format ( "Case #%d: " , testCaseNumber ) ;
    return result . toString ( ) ;
  }
}
