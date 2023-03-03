public static void input ( Scanner input ) {
  String S = input . next ( ) ;
  String K = input . next ( ) ;
  int cnt_1 = 0 ;
  String cnt_aft_1 = null ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '1' ) {
      cnt_1 ++ ;
    }
    else {
      cnt_aft_1 = S . charAt ( i ) ;
      break ;
    }
  }
  if ( S . length ( ) == 1 ) {
    System . out . println ( S ) ;
  }
  else if ( Integer . parseInt ( K ) <= cnt_1 ) {
    System . out . println ( '1' ) ;
  }
  else {
    System . out . println ( cnt_aft_1 ) ;
  }
}
