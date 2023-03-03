static void _ ( ) {
  s = open ( 0 ) ;
  a = new ArrayList ( ) ;
  a . add ( "" ) ;
  for ( String i : s . split ( " " ) ) a . add ( Integer . parseInt ( i ) - 1 , i ) ;
  System . out . println ( ( a . size ( ) > 0 ) ? a . get ( a . size ( ) - 1 ) : a ) ;
}
