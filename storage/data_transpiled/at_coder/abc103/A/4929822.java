public static void main ( ) {
  A = [ int [ ] . valueOf ( i ) for i in input ( ) . split ( ) ] ;
  A . sort ( ) ;
  System . out . println ( A [ A . length - 1 ] - A [ 0 ] ) ;
}
