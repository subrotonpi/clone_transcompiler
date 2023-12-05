public static void print ( String input ) {
  StringBuilder slist = new StringBuilder ( input ) ;
  int [ ] a = list ( map ( Integer . parseInt , input ) ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    slist . insert ( i , '\"' ) ;
  }
  System . out . println ( slist . toString ( ) ) ;
}
