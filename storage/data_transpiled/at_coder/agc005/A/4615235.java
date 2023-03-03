public static void input ( ) {
  int co = 0 ;
  int su = 0 ;
  Stack < Character > a = new Stack < Character > ( ) ;
  a . push ( n . charAt ( 0 ) ) ;
  for ( int i = 0 ;
  i < n . length ( ) - 1 ;
  i ++ ) {
    if ( a . size ( ) == 0 ) {
      a . push ( n . charAt ( i + 1 ) ) ;
    }
    else {
      a . push ( n . charAt ( i + 1 ) ) ;
    }
  }
}
