public static String s ( ) {
  String s = input ( ) ;
  System . out . println ( [ 'Second' , 'First' ] [ ( s . length ( ) + ( s . charAt ( 0 ) == s . length ( ) - 1 ) ) % 2 ] ) ;
  return s ;
}
