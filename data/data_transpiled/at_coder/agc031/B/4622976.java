public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int num = 1 , x = new int [ 200001 ] ;
  c [ 0 ] = 0 ;
  x [ c [ 0 ] ] ++ ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( c [ i ] - c [ i - 1 ] > 0 ) x [ c [ i ] ] = ( x [ c [ i ] ] + num ) % ( 10 * 9 + 7 ) ;
    if ( c [ i ] - c [ i + 1 ] > 0 ) num = x [ c [ i ] ] ;
    else num = 0 ;
  }
  System . out . println ( num ) ;
}
