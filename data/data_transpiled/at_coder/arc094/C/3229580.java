public static int n = Integer . parseInt ( input ) {
  int m = 10 * 9 + 1 , num = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = ( Integer ) input . nextInt ( ) ;
    int b = ( Integer ) input . nextInt ( ) ;
    num += a ;
    if ( a > b && m > b ) m = b ;
  }
  return num ;
}
