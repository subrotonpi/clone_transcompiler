public static final void main ( String [ ] args ) {
  System . setIn ( args ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  boolean X = true ;
  boolean Y = false ;
  int MOD = 10 * 9 + 7 ;
  int i ;
  int ans ;
  boolean prev = false ;
  if ( s . charAt ( 0 ) == t . charAt ( 0 ) ) {
    i = 1 ;
    ans = 3 ;
    prev = X ;
  }
  else {
    i = 2 ;
    ans = 6 ;
    prev = Y ;
  }
  while ( i < N ) {
    if ( s . charAt ( i ) == t . charAt ( i ) ) {
      if ( prev ) {
        ans = ( ans * 2 ) % MOD ;
      }
      else {
        ans = ans % MOD ;
      }
      i ++ ;
      prev = X ;
    }
    else {
      if ( prev ) {
        ans = ( ans * 2 ) % MOD ;
      }
      else {
        ans = ( ans * 3 ) % MOD ;
      }
      i += 2 ;
      prev = Y ;
    }
  }
  System . out . println ( ans ) ;
}
