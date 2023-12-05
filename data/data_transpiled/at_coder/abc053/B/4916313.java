public static void print ( String s ) {
  s = input ( ) ;
  System . out . println ( s . length ( ) - s . substring ( 0 , s . length ( ) - 1 ) . indexOf ( 'Z' ) - s . indexOf ( 'A' ) ) ;
}
