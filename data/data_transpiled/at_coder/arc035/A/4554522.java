public static void input ( ) {
  String s = input . nextLine ( ) ;
  char [ ] d = s . toCharArray ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != d [ i ] && s . charAt ( i ) != '*' && d [ i ] != '*' ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
