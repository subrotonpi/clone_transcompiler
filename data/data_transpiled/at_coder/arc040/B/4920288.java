public static void print ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , 2 ) ) ;
  int r = Integer . parseInt ( input . substring ( 2 , 3 ) ) ;
  StringBuilder sb = new StringBuilder ( input ) ;
  int right = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( sb . charAt ( i ) == '.' ) {
      for ( int j = 0 ;
      j < r ;
      j ++ ) {
        if ( 0 <= i + j && j <= n - 1 ) {
          sb . setCharAt ( i + j , 'o' ) ;
        }
      }
      nuri ++ ;
    }
  }
  System . out . println ( idou + nuri ) ;
}
