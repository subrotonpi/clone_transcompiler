public static void main ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  t = input . nextLine ( ) ;
  System . out . println ( 2 * n - max ( [ i for i in range ( n + 1 ) if s . length ( ) > t . length ( ) ] ) or [ 0 ] ) ;
}
