public static void input ( ) {
  String s = input ( ) ;
  String r = s . substring ( 0 , s . length ( ) - 1 ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != r . charAt ( i ) && s . charAt ( i ) != '*' && r . charAt ( i ) != '*' ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
