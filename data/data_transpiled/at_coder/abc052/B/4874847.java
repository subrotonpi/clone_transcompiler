public static int n ( ) {
  int b = 0 ;
  int t = 0 ;
  for ( char c : input . toCharArray ( ) ) {
    if ( c == 'I' ) {
      t ++ ;
    }
    else {
      t -- ;
    }
    if ( t > b ) {
      b = t ;
    }
  }
  return b ;
}
