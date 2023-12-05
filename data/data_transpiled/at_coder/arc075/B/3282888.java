static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* fight */
  int k = k ;
  int c = k ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int hp = h [ i ] - B * k ;
    if ( hp > 0 ) c -= - ( - hp / ( A - B ) ) ;
    if ( c < 0 ) return false ;
  }
  return k ;
}
