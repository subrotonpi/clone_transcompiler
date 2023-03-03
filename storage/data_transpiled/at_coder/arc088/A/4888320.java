@ Implementation public static void main ( String [ ] args ) {
  int x = Integer . parseInt ( args [ 0 ] ) , y = Integer . parseInt ( args [ 1 ] ) ;
  int count = 1 ;
  do {
    x = x * 2 ;
  }
  while ( x <= y ) ;
  System . out . println ( count ) ;
}
