public static int D ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int count = 0 ;
  int x = 0 ;
  while ( count != N ) {
    x ++ ;
    if ( x % 100 * D == 0 && x % 100 * ( D + 1 ) != 0 ) {
      count ++ ;
    }
  }
  return x ;
}
