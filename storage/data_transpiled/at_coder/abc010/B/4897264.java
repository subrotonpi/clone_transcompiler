public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int cnt = 0 ;
  for ( int i : a ) {
    while ( i % 3 == 2 || i % 2 == 0 ) {
      i -- ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
