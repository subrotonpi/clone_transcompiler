public static boolean chk ( int r , int c ) {
  int cnIn = 0 , cnOut = 0 ;
  if ( ( r = input . nextInt ( ) ) == ( c = input . nextInt ( ) ) ) cnIn ++ ;
  if ( ( r = input . nextInt ( ) ) == ( H - 1 ) && ( c = input . nextInt ( ) ) == ( W - 1 ) ) cnOut ++ ;
  if ( r - 1 >= 0 ) {
    if ( a [ r - 1 ] [ c ] == '#' ) cnIn ++ ;
  }
  if ( r + 1 < H ) {
    if ( a [ r + 1 ] [ c ] == '#' ) cnOut ++ ;
  }
  if ( c - 1 >= 0 ) {
    if ( a [ r ] [ c - 1 ] == '#' ) cnOut ++ ;
  }
  return cnIn == 1 && cnOut == 1 ;
}
