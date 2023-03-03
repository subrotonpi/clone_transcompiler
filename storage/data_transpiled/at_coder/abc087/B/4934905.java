static final int [ ] [ ] getIntegerArray ( ) {
  int a = Integer . parseInt ( System . in ) ;
  int b = Integer . parseInt ( System . in ) ;
  int c = Integer . parseInt ( System . in ) ;
  int x = Integer . parseInt ( System . in ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < c + 1 ;
      k ++ ) {
        if ( i * 500 + j * 100 + k * 50 == x ) {
          count ++ ;
        }
      }
    }
  }
  System . out . println ( count ) ;
  return new int [ ] [ ] {
  }
  ;
}
