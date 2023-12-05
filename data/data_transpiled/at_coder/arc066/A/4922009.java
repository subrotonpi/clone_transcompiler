static final long modpower ( ) {
  long mod = 10 * 9 + 7 ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  long [ ] a = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Long . parseLong ( input . nextLine ( ) ) ;
  }
  long [ ] diff = new long [ a . length ] ;
  for ( int i = 0 ;
  i < diff . length ;
  i ++ ) {
    diff [ i ] = diff [ i ] ;
  }
  long ans ;
  if ( p == 1 ) ans = 1 - Long . parseLong ( a [ 0 ] ) ;
  else if ( p % 2 != 0 ) ans = modpower ( p / 2 ) ;
  else ans = 0 ;
  else ans = 0 ;
  return ans ;
}
