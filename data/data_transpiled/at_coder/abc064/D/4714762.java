public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int i = 0 ;
  int c = 0 ;
  int min_c = 0 ;
  while ( i < N ) {
    if ( S . charAt ( i ) == '(' ) {
      c ++ ;
    }
    else {
      c -- ;
    }
    min_c = Math . min ( c , min_c ) ;
  }
  return c ;
}
