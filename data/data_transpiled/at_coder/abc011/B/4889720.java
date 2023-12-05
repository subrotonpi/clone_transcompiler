static void print ( ) {
  StringBuilder s = new StringBuilder ( input . nextLine ( ) ) ;
  s . append ( s . substring ( 0 , 1 ) . toUpperCase ( ) ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    s . append ( s . charAt ( i ) . toLowerCase ( ) ) ;
  }
  System . out . println ( s . toString ( ) ) ;
}
