public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int [ ] memo = new int [ 26 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int k = ( s . charAt ( i ) - 'a' ) ;
    memo [ k ] ++ ;
  }
  long ans = 1 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    ans = ans * memo [ i ] % ( 1000000007 ) ;
  }
  System . out . println ( ans - 1 ) ;
  return ans ;
}
