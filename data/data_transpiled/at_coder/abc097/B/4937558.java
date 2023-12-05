public static void main ( String input ) {
  int x = Integer . parseInt ( input ) ;
  List < Integer > l = new ArrayList < > ( 1 ) ;
  for ( int i = 2 ;
  i < x ;
  i ++ ) {
    int n = 2 ;
    while ( i * n <= x ) {
      l . add ( i * n ) ;
      n ++ ;
    }
  }
  System . out . println ( max ( l ) ) ;
}
