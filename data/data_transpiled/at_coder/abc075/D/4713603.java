public static double min ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( a ) ;
  double b = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    for ( int j = i + k - 1 ;
    j < n ;
    j ++ ) {
      double p = a . get ( j ) . intValue ( ) - a . get ( i ) . intValue ( ) ;
      List < Double > c = new ArrayList < > ( ) ;
      for ( int j = i ;
      j < j + 1 ;
      j ++ ) {
        c . add ( a . get ( j ) . doubleValue ( ) ) ;
      }
      for ( int s = 0 ;
      s < j - i - k + 2 ;
      s ++ ) {
        double q = c . get ( s + k - 1 ) - c . get ( s ) ;
        b = Math . min ( b , p * q ) ;
      }
    }
  }
  System . out . println ( b ) ;
  return b ;
}
