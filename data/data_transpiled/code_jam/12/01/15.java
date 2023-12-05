static void print ( String s ) {
  final Map < Character , String > m = new HashMap < Character , String > ( ) ;
  m . put ( '\n' , '' ) ;
  m . put ( ' ' , ' ' ) ;
  m . put ( 'a' , 'y' ) ;
  m . put ( 'b' , 'h' ) ;
  m . put ( 'c' , 'e' ) ;
  m . put ( 'd' , 's' ) ;
  m . put ( 'e' , 'o' ) ;
  m . put ( 'f' , 'c' ) ;
  m . put ( 'g' , 'v' ) ;
  m . put ( 'h' , 'x' ) ;
  m . put ( 'i' , 'd' ) ;
  m . put ( 'j' , 'u' ) ;
  m . put ( 'k' , 'i' ) ;
  m . put ( 'l' , 'g' ) ;
  m . put ( 'n' , 'b' ) ;
  m . put ( 'm' , 'l' ) ;
  m . put ( 'o' , 'k' ) ;
  m . put ( 'p' , 'r' ) ;
  m . put ( 'q' , 'z' ) ;
  m . put ( 'r' , 't' ) ;
  m . put ( 's' , 'n' ) ;
  m . put ( 't' , 'w' ) ;
  m . put ( 'u' , 'j' ) ;
  m . put ( 'v' , 'p' ) ;
  m . put ( 'w' , 'f' ) ;
  m . put ( 'x' , 'm' ) ;
  m . put ( 'y' , 'a' ) ;
  m . put ( 'z' , 'q' ) ;
  int n = Integer . parseInt ( s ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = s . toUpperCase ( ) ;
    System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
    System . out . println ( s ) ;
  }
  System . out . println ( m . get ( s ) ) ;
}
