public static int n = Integer . parseInt ( input ) {
  int s = 0 ;
  int m = 10 * 9 + 7 ;
  boolean same = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a > b ) m = Math . min ( m , b ) ;
  }
  return s ;
}
