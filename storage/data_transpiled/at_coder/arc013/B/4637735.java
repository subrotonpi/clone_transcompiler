public static void print ( int n = Integer . parseInt ( input ) ) {
  int h = 0 , m = 0 , l = 0 ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    if ( h < c ) h = c ;
    if ( m < b ) m = b ;
    if ( l < a ) l = a ;
  }
}
