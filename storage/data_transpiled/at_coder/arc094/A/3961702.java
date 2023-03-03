public static void print ( int [ ] ar ) {
  ar = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < ar . length ;
  i ++ ) {
    ar [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( ar ) ;
  int count = 0 ;
  count += ( ar [ 2 ] - ar [ 0 ] ) / 2 ;
  count += ( ar [ 2 ] - ar [ 1 ] ) / 2 ;
  if ( ( ar [ 2 ] - ar [ 0 ] ) % 2 == 0 && ( ar [ 2 ] - ar [ 1 ] ) % 2 == 0 ) {
    System . out . println ( count ) ;
  }
  else if ( ( ar [ 2 ] - ar [ 0 ] ) % 2 == 0 || ( ar [ 2 ] - ar [ 1 ] ) % 2 == 0 ) {
    System . out . println ( count + 2 ) ;
  }
  else {
    System . out . println ( count + 1 ) ;
  }
}
