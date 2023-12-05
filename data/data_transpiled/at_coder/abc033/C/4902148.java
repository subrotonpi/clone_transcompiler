public static void input ( ) {
  String S = input ( ) ;
  LinkedList < String > ll = new LinkedList < String > ( S . split ( "\\+" ) ) ;
  int count = 0 ;
  for ( String l : ll ) {
    if ( l . indexOf ( '0' ) == 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
