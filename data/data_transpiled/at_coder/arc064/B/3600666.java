public static void input ( ) {
  String s = input ( ) ;
  int x = ( s . length ( ) + ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) ) % 2 ;
  System . out . println ( 'First' * x + 'Second' * ( 1 - x ) ) ;
}
