private static void solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String query = "b" ;
  String s = input . nextLine ( ) ;
  if ( s . equals ( query ) ) {
    System . out . println ( "0" ) ;
    exit ( ) ;
  }
  int tp = 0 ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    if ( i % 3 == 2 ) {
      query = "b" + query + "b" ;
    }
    else if ( i % 3 == 0 ) {
      query = "a" + query ;
    }
    else {
      query = "c" + query + "a" ;
    }
    tp ++ ;
    if ( query . equals ( s ) ) {
      System . out . println ( tp ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "-1" ) ;
}
