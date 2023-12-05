public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String S1 = input ( ) ;
  String S2 = input ( ) ;
  int m = 10 * 9 + 7 ;
  boolean v = ( S1 . charAt ( 0 ) == S2 . charAt ( 0 ) ) ;
  int r = 0 , i = 0 ;
  if ( v ) {
    r = 3 ;
    i = 1 ;
  }
  else {
    r = 6 ;
    i = 2 ;
  }
  while ( i < N ) {
    if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
      if ( v ) {
        r *= 2 ;
        r %= m ;
      }
      v = true ;
      i ++ ;
    }
    else {
      if ( v ) {
        r *= 2 ;
        r %= m ;
      }
      else {
        r *= 3 ;
        r %= m ;
      }
      v = false ;
      i += 2 ;
    }
  }
  System . out . println ( r ) ;
}
