public static void print ( int n ) {
  n = input . nextInt ( ) ;
  System . out . println ( n % 2 == 0 ? Integer . MAX_VALUE / 2 : Integer . MAX_VALUE + 1 ) ;
  if ( n % 2 == 1 ) System . out . println ( 1 ) ;
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    System . out . println ( 2 ) ;
  }
}
