) public static void data ( ) {
  data = [ input . nextLine ( ) . trim ( ) for _ in range ( 12 ) ] ;
  System . out . println ( len ( [ 1 for s in data if 'r' in s ] ) ) ;
}
