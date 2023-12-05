public static void print ( int n ) {
  int [ ] s = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ a ] = s [ a - 1 ] + 1 ;
  }
  System . out . println ( n - max ( s ) ) ;
}
