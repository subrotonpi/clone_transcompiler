public static void input ( int N ) {
  int state ;
  N = input . nextInt ( ) ;
  String s1 = input . substring ( 0 , 1 ) ;
  String s2 = input . substring ( 0 , 1 ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == 0 ) {
      if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
        ans *= 3 ;
        state = 0 ;
      }
      else {
        ans *= 6 ;
        state = 1 ;
      }
    }
    else {
      if ( ( s1 . charAt ( i ) == s1 . charAt ( i - 1 ) ) && ( s2 . charAt ( i ) == s2 . charAt ( i - 1 ) ) ) continue ;
      if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
        if ( state == 0 ) ans *= 2 ;
        else ans *= 1 ;
        state = 0 ;
      }
      else {
        if ( state == 0 ) ans *= 2 ;
        else ans *= 3 ;
        state = 1 ;
      }
    }
    ans %= 10 * 9 + 7 ;
  }
  System . out . println ( ans ) ;
}
