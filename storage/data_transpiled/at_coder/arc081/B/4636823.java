public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s1 = input . nextLine ( ) ;
  String s2 = input . nextLine ( ) ;
  int mod = 10 * 9 + 7 ;
  boolean b = false ;
  boolean did = false ;
  int ans = 0 ;
  if ( s1 . charAt ( 0 ) == s2 . charAt ( 0 ) ) {
    b = true ;
    ans += 3 ;
  }
  else {
    did = true ;
    ans = 6 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
      if ( b ) ans = ans * 2 % mod ;
      else ans = ans * 3 % mod ;
      did = true ;
      b = false ;
    }
    else did = false ;
  }
  System . out . println ( ans ) ;
}
