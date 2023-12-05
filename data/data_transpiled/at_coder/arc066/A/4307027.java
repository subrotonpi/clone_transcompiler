public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > a = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( i ) ;
  }
  Collections . sort ( a ) ;
  if ( n % 2 == 1 && a . get ( 0 ) != 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    if ( n % 2 == 1 && a . get ( 0 ) == 0 ) {
      a . remove ( 0 ) ;
    }
    int d = ( n % 2 == 1 ) ? 0 : 1 ;
    for ( int i = 0 ;
    i < n / 2 ;
    i ++ ) {
      if ( a . get ( 2 * i ) != 2 * ( i + 1 ) - d || a . get ( 2 * i + 1 ) != 2 * ( i + 1 ) - d ) {
        System . out . println ( 0 ) ;
        break ;
      }
    }
    else {
      System . out . println ( 2 * ( n / 2 ) % ( 10 * 9 + 7 ) ) ;
    }
  }
}
