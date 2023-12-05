public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = i ;
  }
  int res = 100 ;
  for ( int i : a ) {
    int cnt = 0 ;
    while ( i % 2 == 0 ) {
      cnt ++ ;
      i /= 2 ;
    }
    res = Math . min ( res , cnt ) ;
  }
  System . out . println ( res ) ;
}
