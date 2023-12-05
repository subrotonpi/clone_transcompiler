public static void print ( String s ) {
  s = input ( ) ;
  System . out . println ( [ c != d for c , d in zip ( s . substring ( 0 , s . length ( ) - 1 ) , s . substring ( 1 , s . length ( ) ) ) ] . count ( true ) ) ;
}
