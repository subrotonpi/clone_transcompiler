public static void print ( int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = Integer . parseInt ( input . nextLine ( ) ) ;
    String y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( y . equals ( "JPY" ) ) {
      sum += Integer . parseInt ( x ) ;
    }
    else {
      sum += Double . parseDouble ( x ) * 380000 ;
    }
  }
  System . out . println ( sum ) ;
}
