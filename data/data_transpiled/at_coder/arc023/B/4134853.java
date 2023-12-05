public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > inputs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i <= W ;
  i ++ ) {
    inputs . add ( Collections . singletonList ( i ) ) ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i <= W ;
  i ++ ) {
    if ( ( W % 2 ) == ( i % 2 ) ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        int row = j ;
        int col = i - j ;
        if ( row < R && col < C ) {
          ans . add ( inputs . get ( row ) . get ( col ) ) ;
        }
      }
    }
  }
  System . out . println ( Collections . max ( ans ) ) ;
  return ans . size ( ) ;
}
