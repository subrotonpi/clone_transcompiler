public static String main ( int K , int N ) {
  ArrayList < Integer > ans = new ArrayList < > ( ) ;
  if ( K % 2 == 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( i == 0 ) {
        ans . add ( K / 2 ) ;
      }
      else {
        ans . add ( K ) ;
      }
    }
  }
  else if ( K == 1 ) {
    int n2 = Math . ceil ( N / 2 ) ;
    for ( int i = 0 ;
    i < n2 ;
    i ++ ) {
      ans . add ( 1 ) ;
    }
  }
  else {
    int K2 = Math . ceil ( K / 2 ) ;
    ans = new ArrayList < > ( K2 ) ;
    int n = N / 2 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ans . get ( ans . size ( ) - 1 ) == 1 ) {
        ans . remove ( ans . size ( ) - 1 ) ;
      }
      else {
        ans . remove ( ans . size ( ) - 1 ) ;
        while ( ans . size ( ) < N ) {
          ans . add ( K ) ;
        }
      }
    }
  }
  return String . join ( ans ) ;
}
