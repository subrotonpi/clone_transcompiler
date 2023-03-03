static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ 200001 ] ;
  c [ 0 ] = 0 ;
  x [ c [ 0 ] ] ++ ;
  int num = 1 ;
  int p = 10 * 9 + 7 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( c [ i ] - c [ i - 1 ] != 0 ) {
      x [ c [ i ] ] += num ;
      x [ c [ i ] ] = x [ c [ i ] ] % p ;
    }
    if ( c [ i ] - c [ i + 1 ] != 0 ) num = x [ c [ i ] ] % p ;
    else num = 0 ;
  }
  System . out . println ( num ) ;
}
