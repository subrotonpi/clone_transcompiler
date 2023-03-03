public static int [ ] solve ( int n , int a , int b ) {
  if ( a + b - 1 > n ) return new int [ ] {
    - 1 }
    ;
    if ( a * b < n ) return new int [ ] {
      - 1 }
      ;
      List < Integer > xs = new ArrayList < > ( ) ;
      xs . add ( new Integer ( 0 ) ) ;
      for ( int j = 0 ;
      j < b ;
      j ++ ) {
        xs . add ( new Integer ( j ) ) ;
      }
      for ( int x : xs ) {
        int k = f . size ( ) ;
        f . put ( x , k ) ;
      }
      return new int [ ] {
      }
      ;
    }
    