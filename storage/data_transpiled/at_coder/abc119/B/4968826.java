public static double getCoin ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String u = input . nextLine ( ) ;
    if ( String . valueOf ( u ) . equals ( "BTC" ) ) {
      sum += Double . parseDouble ( x ) * 380000.0 ;
    }
    else {
      sum += Double . parseDouble ( x ) ;
    }
  }
  System . out . println ( sum ) ;
  return sum ;
}
