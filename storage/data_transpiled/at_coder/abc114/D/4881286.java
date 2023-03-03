@ Function public static List < Integer > factorize ( ) {
  return l -> {
    int b = 2 ;
    List < Integer > fct = new ArrayList < > ( ) ;
    while ( b * b <= n ) {
      while ( n % b == 0 ) {
        n /= b ;
        fct . add ( b ) ;
      }
      b ++ ;
    }
    if ( n > 1 ) {
      fct . add ( n ) ;
    }
    return fct ;
  }
  ;
}
