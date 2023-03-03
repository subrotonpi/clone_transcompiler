public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int s = 0 ;
  int t = 0 ;
  int a = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s += A [ i ] ;
    if ( i % 2 == 0 ) {
      if ( s >= 0 ) {
        a += s + 1 ;
        s = - 1 ;
      }
    }
    if ( i % 2 != 0 ) {
      if ( s <= 0 ) {
        a += - s + 1 ;
        s = 1 ;
      }
    }
  }
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    t += A [ j ] ;
    if ( j % 2 != 0 ) {
      if ( t >= 0 ) {
        b += t + 1 ;
        t = - 1 ;
      }
    }
    if ( j % 2 == 0 ) {
      if ( t <= 0 ) {
        b += - t + 1 ;
        t = 1 ;
      }
    }
  }
  System . out . println ( Math . min ( a , b ) ) ;
}
