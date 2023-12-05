public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ N ] ;
  r [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tmp = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( tmp > max ( r ) ) r [ i ] = tmp ;
    else i ++ ;
  }
  Arrays . sort ( r ) ;
  return r ;
}
