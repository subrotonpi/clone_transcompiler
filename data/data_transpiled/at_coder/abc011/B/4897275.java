public static void print ( String s ) {
  s = input . nextLine ( ) ;
  s = s . toLowerCase ( ) ;
  if ( s . length ( ) >= 2 ) {
    print ( Character . toUpperCase ( s . charAt ( 0 ) ) + s . substring ( 1 ) ) ;
  }
  else {
    print ( Character . toUpperCase ( s . charAt ( 0 ) ) ) ;
  }
}
