public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int d = n ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    if ( d <= a ) {
      d += b ;
    }
    d -= c ;
    if ( d < 0 ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( "complete" ) ;
  }
}
