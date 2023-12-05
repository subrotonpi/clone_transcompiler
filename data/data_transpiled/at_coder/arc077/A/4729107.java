public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( n % 2 == 0 ) {
    s = a . subList ( n - 1 , n - 2 ) + a . subList ( 0 , n ) ;
  }
  else {
    s = a . subList ( n - 1 , n - 2 ) + a . subList ( 1 , n ) ;
  }
  System . out . println ( s ) ;
}
