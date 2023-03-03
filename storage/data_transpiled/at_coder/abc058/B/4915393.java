public static String input ( ) {
  String O = input ( ) ;
  String E = input ( ) ;
  StringBuffer sb = new StringBuffer ( ) ;
  if ( O . length ( ) - E . length ( ) == 1 ) {
    for ( int i = 0 ;
    i < O . length ( ) ;
    i ++ ) {
      sb . append ( O . charAt ( i ) ) ;
    }
    sb . append ( E ) ;
  }
  else {
    for ( int i = 0 ;
    i < E . length ( ) ;
    i ++ ) {
      sb . append ( E ) ;
    }
  }
  System . out . println ( sb ) ;
  return sb . toString ( ) ;
}
