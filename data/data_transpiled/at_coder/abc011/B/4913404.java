public static void print ( String s ) {
  s = input . nextLine ( ) ;
  if ( s . length ( ) == 1 ) {
    System . out . println ( s . toUpperCase ( ) ) ;
  }
  else {
    System . out . println ( s . substring ( 0 , 1 ) . toUpperCase ( ) + s . substring ( 1 ) . toLowerCase ( ) ) ;
  }
}
