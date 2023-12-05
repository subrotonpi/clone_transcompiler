static void n ( ) throws IOException {
  BufferedReader a = open ( 0 ) ;
  n = Integer . parseInt ( n . split ( " " ) [ 0 ] ) ;
  while ( new HashSet < > ( a ) . add ( String . valueOf ( n ) ) ) n ++ ;
  System . out . println ( n ) ;
}
