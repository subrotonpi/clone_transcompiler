public static void main ( String input ) {
  a = [ int . parseInt ( i ) for i in input . split ( ' ' ) ] ;
  a . sort ( ) ;
  System . out . println ( sum ( a ) - 2 * a [ 1 ] ) ;
}
