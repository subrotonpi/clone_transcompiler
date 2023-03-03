public static int input ( ) {
  int n = input . nextInt ( ) ;
  if ( n == 1 ) {
    System . out . println ( Integer . MIN_VALUE ) ;
    exit ( ) ;
  }
  int flag = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( Integer . MIN_VALUE != n ) {
      flag = 1 ;
    }
  }
  return flag ;
}
