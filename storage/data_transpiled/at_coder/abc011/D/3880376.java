public static final int getN ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int D = Integer . parseInt ( input ( ) ) ;
  int X = Integer . parseInt ( input ( ) ) ;
  int Y = Integer . parseInt ( input ( ) ) ;
  X = Math . abs ( X ) ;
  Y = Math . abs ( Y ) ;
  {
    int a = 1 ;
    if ( X % D != 0 || Y % D != 0 ) {
      System . out . println ( 0 ) ;
    }
    else {
      X /= D ;
      Y /= D ;
      D = 1 ;
      if ( N - X - Y < 0 || ( N - X - Y ) % 2 != 0 ) {
        System . out . println ( 0 ) ;
      }
      else {
        int sum = kj ( N ) ;
        int bunbo = 4 * N ;
        int bunsi = 0 ;
        int tmp = kj ( N ) ;
        for ( int i = 0 ;
        i < ( N - X - Y ) / 2 + 1 ;
        i ++ ) {
          bunsi += tmp / ( kj ( X + ( N - X - Y ) / 2 - i ) * kj ( ( N - X - Y ) / 2 - i ) * kj ( Y + i ) * kj ( i ) ) ;
        }
        System . out . println ( bunsi / bunbo ) ;
      }
    }
  }
  ) ;
  return N ;
}
