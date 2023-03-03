public static void main ( String input ) {
  L = Integer . parseInt ( input ) ;
  R = Integer . parseInt ( input ) ;
  l = Integer . parseInt ( input ) ;
  r = Integer . parseInt ( input ) ;
  int [ ] AL = new int [ 41 ] ;
  int [ ] AR = new int [ 41 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    AL [ l [ i ] ] ++ ;
  }
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    AR [ r [ i ] ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < 41 ;
  i ++ ) {
    ans += Math . min ( AL [ i ] , AR [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
