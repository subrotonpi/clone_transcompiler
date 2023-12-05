static final int [ ] inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int H = inpl ( ) ;
  int W = inpl ( ) ;
  if ( H % 3 == 0 || W % 3 == 0 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  if ( H == 2 || W == 2 ) {
    System . out . println ( 1 ) ;
    System . exit ( 0 ) ;
  }
  int a = W / 3 ;
  int b = W % 3 ;
  int c = H / 3 ;
  int d = H % 3 ;
  int ans = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    ans = Math . min ( ans , Math . max ( H * ( a + i ) , ( H / 2 + H % 2 ) * ( W - a - i ) , ( H / 2 ) * ( W - a - i ) ) - Math . min ( H * ( a + i ) , ( H / 2 + W % 2 ) * ( W - c - i ) ) ) ;
  }
  return ans ;
}
