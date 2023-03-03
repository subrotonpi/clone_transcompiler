public static void print ( int n ) {
  int r = input . nextInt ( ) ;
  int ct = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( r . charAt ( i ) == 'A' ) ct += 4 ;
    if ( r . charAt ( i ) == 'B' ) ct += 3 ;
    if ( r . charAt ( i ) == 'C' ) ct += 2 ;
    if ( r . charAt ( i ) == 'D' ) ct += 1 ;
  }
  System . out . println ( ct / n ) ;
}
