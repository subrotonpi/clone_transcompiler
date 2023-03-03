public static void main ( String [ ] args ) {
  String atcoder = "atcoder" ;
  int cnt = 0 ;
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '@' && t . charAt ( i ) != ' ' ) ++ cnt ;
    if ( t . charAt ( i ) == '@' && s . charAt ( i ) != ' ' ) ++ cnt ;
  }
  if ( cnt == s . length ( ) ) return "You can win" ;
  else return "You will lose" ;
}
