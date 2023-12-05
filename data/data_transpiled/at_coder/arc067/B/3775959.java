public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ar = new int [ a ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < a - 1 ;
  i ++ ) {
    if ( ( ar [ i + 1 ] - ar [ i ] ) * b <= c ) {
      count += ( ar [ i + 1 ] - ar [ i ] ) * b ;
    }
    else {
      count += c ;
    }
  }
  System . out . println ( count ) ;
  return count ;
}
