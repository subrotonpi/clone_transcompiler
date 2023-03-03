public static void input ( ) {
  int n = input . nextInt ( ) ;
  int result = 0 ;
  if ( Integer . parseInt ( n ) % 10 == 0 ) {
    result = 10 ;
  }
  else {
    result = Integer . parseInt ( n ) ;
  }
  System . out . println ( result ) ;
}
