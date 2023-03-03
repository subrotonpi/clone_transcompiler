public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int l = s . length ( ) ;
  for ( int i = 0 ;
  i < l / 2 ;
  i ++ ) {
    if ( s . charAt ( i ) != '*' && s . charAt ( l - 1 - i ) != '*' && s . charAt ( i ) != s . charAt ( l - 1 - i ) ) {
      System . out . println ( "NO" ) ;
      return ;
    }
  }
  System . out . println ( "YES" ) ;
}
