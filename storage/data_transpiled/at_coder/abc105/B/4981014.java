public static void print ( int n ) {
  int i = input ( ) ;
  List L = new ArrayList ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) for ( int j = 0 ;
  j < 15 ;
  j ++ ) L . add ( 4 * i + 7 * j ) ;
  System . out . println ( L . indexOf ( n ) == 0 ? "No" : "Yes" ) ;
}
