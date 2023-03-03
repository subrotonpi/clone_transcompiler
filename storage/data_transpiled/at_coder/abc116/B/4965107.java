public static int s = Integer . parseInt ( input ) {
  int b ;
  /*if (x % 2) {
  return (int) x / 2;
  } else {
  return (int) 3*x + 1;
  }*/
  ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
  a . add ( s ) ;
  for ( int i = 1 ;
  i < 1000000 ;
  i ++ ) {
    b = a . get ( i - 1 ) ;
    if ( a . contains ( b ) ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
    else {
      a . add ( b ) ;
    }
  }
  return a . size ( ) ;
}
