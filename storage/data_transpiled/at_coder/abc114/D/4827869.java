static List < Integer > soin ( int n ) {
  final List < Integer > re = new ArrayList < > ( ) ;
  while ( n > 1 ) {
    for ( int i = 2 ;
    i <= ( int ) ( n * 0.5 ) ;
    i ++ ) {
      if ( n % i == 0 ) {
        re . add ( i ) ;
        n /= i ;
        break ;
      }
    }
    else {
      re . add ( n ) ;
      n = 0 ;
    }
  }
  return re ;
}
