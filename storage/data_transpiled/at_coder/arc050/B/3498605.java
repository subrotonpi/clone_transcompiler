public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int n1 = 0 ;
  int n2 = Integer . parseInt ( 1e18 ) ;
  while ( n1 != n2 ) {
    int n = ( n1 + n2 + 1 ) / 2 ;
    int a2 = ( r - n ) / ( x - 1 ) ;
    int a1 = ( n * y - b + y - 2 ) / ( y - 1 ) ;
    if ( a2 >= 0 && a1 <= n && a1 <= a2 ) n1 = n ;
    else n2 = n - 1 ;
  }
  System . out . println ( n1 ) ;
}
