public static void input ( ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int i = 0 ;
  while ( s . charAt ( i ) == '1' ) {
    i ++ ;
    if ( i > s . length ( ) - 1 ) {
      break ;
    }
  }
  if ( k <= s . length ( ) && i >= k ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( s . charAt ( i ) ) ;
  }
}
