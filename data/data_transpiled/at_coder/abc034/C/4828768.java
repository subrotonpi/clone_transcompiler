public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  /* mod pow */
  int r = 1 ;
  while ( b > 0 ) {
    if ( ( b & 1 ) != 0 ) {
      r = r * r % m ;
    }
    a = a * a % m ;
    b >>= 1 ;
  }
  return r ;
}
