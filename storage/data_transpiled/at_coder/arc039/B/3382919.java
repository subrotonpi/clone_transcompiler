public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  if ( k < n ) {
    long ans = 1 ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      ans *= ( n + k - 1 - i ) ;
      ans /= ( i + 1 ) ;
    }
    System . out . println ( ans % 1000000007 ) ;
    quit ( ) ;
  }
  else {
    ArrayList < Integer > list = new ArrayList < Integer > ( ) ;
    for ( int i = 1 ;
    i <= k ;
    i ++ ) {
      list . add ( i * n ) ;
    }
    if ( list . contains ( k ) ) {
      System . out . println ( 1 ) ;
      quit ( ) ;
    }
    else {
      int d = k / n ;
      k -= d * n ;
      long ans = 1 ;
      for ( int i = 0 ;
      i < k ;
      i ++ ) {
        ans *= ( n - i ) ;
        ans /= ( i + 1 ) ;
      }
      System . out . println ( ans % 1000000007 ) ;
    }
  }
}
