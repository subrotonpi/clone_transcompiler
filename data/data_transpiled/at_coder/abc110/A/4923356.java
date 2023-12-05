public static void print ( int [ ] l ) {
  l = list ( map ( Integer . parseInt , input ( ) ) ) ;
  l . sort ( reverse ( ) ) ;
  System . out . println ( 10 * l [ 0 ] + l [ 1 ] + l [ 2 ] ) ;
}
