public static void main ( String [ ] args ) {
  int [ ] num = new int [ input . length ] ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    num [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( num ) ;
  int ans = 0 ;
  ans += ( num [ 2 ] - num [ 1 ] ) ;
  ans += ( num [ 1 ] - num [ 0 ] ) / 2 ;
  if ( ( num [ 1 ] - num [ 0 ] ) % 2 == 1 ) {
    ans += 2 ;
  }
  System . out . println ( ans ) ;
}
