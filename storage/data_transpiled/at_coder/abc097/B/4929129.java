public static int b = Integer . parseInt ( input ) {
  int max = 0 ;
  for ( int i = 1 ;
  i <= 33 ;
  i ++ ) {
    for ( int j = 2 ;
    j <= 11 ;
    j ++ ) {
      int val = i * j ;
      if ( val > b ) break ;
      if ( max < val ) max = val ;
    }
  }
  return max ;
}
