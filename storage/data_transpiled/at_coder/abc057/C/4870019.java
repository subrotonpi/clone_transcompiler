public static List < Integer > divisorAll ( int N ) {
  return new ArrayList < > ( ) {
    {
      final List < Integer > l = new ArrayList < > ( ) ;
      l . add ( 1 ) ;
      l . add ( N ) ;
      for ( int i = 2 ;
      i <= ( int ) Math . sqrt ( n ) ;
      i ++ ) {
        if ( n % i == 0 ) {
          l . add ( i ) ;
          l . add ( n / i ) ;
        }
      }
      Collections . sort ( l ) ;
    }
  }
  ;
}
