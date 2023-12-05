public static int N = Integer . parseInt ( input ) {
  int maxCounter = 0 ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int counter = 0 ;
    int ans_i = i ;
    for ( int j = 0 ;
    j < 7 ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        counter ++ ;
        i = i / 2 ;
      }
      else {
        if ( counter > maxCounter ) {
          maxCounter = counter ;
          ans = ans_i ;
        }
        break ;
      }
    }
  }
  return ans ;
}
