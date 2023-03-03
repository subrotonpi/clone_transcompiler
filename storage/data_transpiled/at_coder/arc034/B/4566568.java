public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > f = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 30 ;
  i ++ ) {
    if ( n < 10 * i ) {
      a = i ;
      break ;
    }
  }
  for ( int j = 1 ;
  j < a * 9 ;
  j ++ ) {
    int b = n - j ;
    int s = b ;
    ArrayList < Integer > c = new ArrayList < > ( ) ;
    while ( s > 0 ) {
      c . add ( s % 10 ) ;
      s /= 10 ;
    }
    int e = Integer . parseInt ( c . toString ( ) ) ;
    if ( e == j ) {
      f . add ( b ) ;
    }
  }
  if ( f . size ( ) == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    Collections . sort ( f ) ;
    System . out . println ( f . size ( ) ) ;
    for ( int t = 0 ;
    t < f . size ( ) ;
    t ++ ) {
      System . out . println ( f . get ( t ) ) ;
    }
  }
}
