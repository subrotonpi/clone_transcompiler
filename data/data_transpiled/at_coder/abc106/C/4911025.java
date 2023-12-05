public static void input ( ) {
  String s = input . nextLine ( ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i == K - 1 ) {
      System . out . println ( s . charAt ( i ) ) ;
      break ;
    }
    if ( s . charAt ( i ) == '1' ) {
      continue ;
    }
    else {
      System . out . println ( s . charAt ( i ) ) ;
      break ;
    }
  }
}
