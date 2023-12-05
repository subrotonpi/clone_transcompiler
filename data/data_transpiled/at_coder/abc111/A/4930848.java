public static void input ( ) {
  String n = input ( ) ;
  StringBuffer change = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < n . length ( ) ;
  i ++ ) {
    if ( n . charAt ( i ) == '1' ) {
      change . append ( "9" ) ;
    }
    else {
      change . append ( '1' ) ;
    }
  }
  System . out . println ( change ) ;
}
