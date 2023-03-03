public static String input ( ) {
  String s = input ( ) ;
  String tmp1 = new LinkedList < String > ( ) ;
  String tmp2 = new LinkedList < String > ( ) ;
  tmp2 . reverse ( ) ;
  String res = "YES" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( tmp1 . charAt ( i ) != tmp2 . charAt ( i ) ) {
      if ( tmp1 . charAt ( i ) == '*' || tmp2 . charAt ( i ) == '*' ) {
      }
      else {
        res = "NO" ;
        break ;
      }
    }
  }
  System . out . println ( res ) ;
  return res ;
}
