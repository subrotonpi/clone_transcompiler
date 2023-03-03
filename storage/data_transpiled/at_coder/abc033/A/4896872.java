static void print ( String n ) {
  int i = 0 ;
  for ( String s : input . split ( n ) ) {
    if ( s . charAt ( 0 ) == n . charAt ( 1 ) == n . charAt ( 2 ) == n . charAt ( 3 ) ) {
      System . out . println ( "SAME" ) ;
    }
    else {
      System . out . println ( "DIFFERENT" ) ;
    }
  }
}
