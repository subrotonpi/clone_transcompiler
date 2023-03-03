public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s1 = input . nextLine ( ) ;
  String s2 = input . nextLine ( ) ;
  long mod = 1000000007 ;
  long ret ;
  int i ;
  ret = 3 ;
  if ( s1 . charAt ( 0 ) == s2 . charAt ( 0 ) ) {
    i = 1 ;
    ret = 3 ;
  }
  else {
    i = 2 ;
    ret = 6 ;
  }
  while ( i < n ) {
    if ( s1 . charAt ( i - 1 ) == s2 . charAt ( i - 1 ) ) {
      if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
        ret *= 2 ;
        i ++ ;
      }
      else {
        ret *= 2 ;
        i += 2 ;
      }
    }
    else {
      if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
        ret *= 1 ;
        i ++ ;
      }
      else {
        ret *= 3 ;
        i += 2 ;
      }
    }
  }
  System . out . println ( ret % mod ) ;
}
