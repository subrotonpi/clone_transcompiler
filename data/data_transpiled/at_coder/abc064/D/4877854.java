public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  while ( true ) {
    int nl = 0 ;
    int nr = 0 ;
    char j = 'O' ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      if ( S . charAt ( i ) == '(' ) nl ++ ;
      else nr ++ ;
    }
    if ( nr > nl ) {
      S = S + ')' ;
    }
  }
}
