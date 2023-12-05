public static void n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  a = new HashSet < > ( ) ;
  while ( a . containsAll ( new HashSet < > ( String . valueOf ( n ) ) ) ) n ++ ;
  System . out . println ( n ) ;
}
