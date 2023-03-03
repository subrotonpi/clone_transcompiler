public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  t = input . nextLine ( ) ;
  l = 0 ;
  m = max ( Arrays . stream ( s . chars ( ) ) . filter ( i -> s . length ( ) - i ) . map ( s -> t ) . orElse ( 0 ) ) ;
  System . out . println ( 2 * n - m ) ;
}
