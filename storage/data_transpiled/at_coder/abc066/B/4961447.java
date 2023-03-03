public static void input ( ) {
  s = input ( ) ;
  s = s . substring ( 0 , s . length ( ) - 2 ) ;
  while ( s . length ( ) != s . length ( ) / 2 ) {
    s = s . substring ( 0 , s . length ( ) - 2 ) ;
  }
  System . out . println ( s . length ( ) ) ;
}
