public static int [ ] [ ] getIntegerArray ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < c + 1 ;
      k ++ ) {
        if ( x == 500 * i + 100 * j + 50 * k ) {
          y ++ ;
        }
      }
    }
  }
  return new int [ ] [ ] {
    y }
    ;
  }
  