public static int N = Integer . parseInt ( input ) {
  int [ ] isO = {
    0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }
    ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String s = new String ( input ) ;
      for ( int j = 0 ;
      j < 9 ;
      j ++ ) {
        if ( s . charAt ( j ) == 'x' ) {
          if ( isO [ j ] == 1 ) {
            ans ++ ;
            isO [ j ] = 0 ;
          }
          ans ++ ;
        }
        else if ( s . charAt ( j ) == 'o' ) {
          isO [ j ] = 1 ;
        }
      }
    }
    return ans + Arrays . asList ( isO ) ;
  }
  