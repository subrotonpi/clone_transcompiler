public static int [ ] S ( Scanner input ) {
  int N = input . nextInt ( ) ;
  if ( N % 2 == 0 ) {
    int n = ( int ) ( N / 2 ) ;
    int K = n ;
    int i = 0 ;
    while ( i < n ) {
      if ( S . charAt ( n - 1 - i ) == S . charAt ( n + i ) ) {
        i ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( K + i ) ;
  }
  else {
    int n = ( int ) ( ( N - 1 ) / 2 ) ;
    if ( N == 1 ) {
      System . out . println ( 1 ) ;
    }
    else {
      int K = n + 1 ;
      int i = 0 ;
      if ( S . charAt ( n ) == S . charAt ( n + 1 ) ) {
        while ( i < n ) {
          if ( S . charAt ( n - i - 1 ) == S . charAt ( n + i + 1 ) ) {
            i ++ ;
          }
          else {
            break ;
          }
        }
      }
      System . out . println ( K + i ) ;
    }
  }
  return S ;
}
