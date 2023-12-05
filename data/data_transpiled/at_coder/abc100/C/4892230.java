public static int N = Integer . parseInt ( input ) {
  int [ ] a = map . get ( input ) . split ( " " ) ;
  /* counter */
  int num = 0 ;
  while ( a [ num ] % 2 == 0 ) {
    num ++ ;
    a [ num ] /= 2 ;
  }
  return num ;
}
