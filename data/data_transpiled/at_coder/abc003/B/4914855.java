public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != t . charAt ( i ) ) {
      if ( ( s . charAt ( i ) == '@' && t . charAt ( i ) == '@' ) || ( t . charAt ( i ) == '@' && s . charAt ( i ) == '@' ) || ( s . charAt ( i ) == '@' && t . charAt ( i ) == '@' ) ) {
        continue ;
      }
      else {
        System . out . println ( "You will lose" ) ;
        exit ( ) ;
      }
    }
  }
  else {
    System . out . println ( "You can win" ) ;
  }
}
