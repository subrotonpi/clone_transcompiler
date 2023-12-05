public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int d = 0 ;
  int e = 0 ;
  int f = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( e < n && ( d & a [ e ] ) == 0 ) {
      d += a [ e ] ;
      e ++ ;
    }
    d -= a [ i ] ;
    f += e - i ;
  }
  System . out . println ( f ) ;
}
