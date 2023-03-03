private static void solve ( ) throws IOException {
  String s = input . nextLine ( ) ;
  String k = input . nextLine ( ) ;
  int size = Integer . parseInt ( k ) ;
  boolean [ ] a = new boolean [ size ] ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    a [ i ] = s . equals ( "-" ) ? false : true ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < a . length - k + 1 ;
  i ++ ) {
    if ( ! a [ i ] ) {
      ans ++ ;
      for ( int pos = i ;
      pos < i + k ;
      pos ++ ) {
        a [ pos ] = ! a [ pos ] ;
      }
    }
  }
  if ( Arrays . equals ( a , s ) ) {
    return ;
  }
  else {
    return "IMPOSSIBLE" ;
  }
}
