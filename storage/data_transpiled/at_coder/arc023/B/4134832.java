public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > inputs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    inputs . add ( Collections . singletonList ( i ) ) ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= W ;
  i ++ ) {
    if ( ( W % 2 ) == ( i % 2 ) ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        int row = j , col = i - j ;
        if ( row < R && col < C ) {
          ans . add ( inputs . get ( row ) . get ( col ) ) ;
        }
      }
    }
  }
  if ( W % 2 == 0 ) {
    ans . add ( inputs . get ( 0 ) . get ( 0 ) ) ;
  }
  System . out . println ( Collections . max ( ans ) ) ;
  return 0 ;
}
