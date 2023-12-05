public static void main ( String input ) {
  int s = Integer . parseInt ( input ) ;
  progression = new ArrayList < Integer > ( ) ;
  progression . add ( s ) ;
  int n = s ;
  int count = 1 ;
  do {
    count ++ ;
    if ( n % 2 == 0 ) {
      n = n / 2 ;
    }
    else {
      n = 3 * n + 1 ;
    }
  }
  while ( n > 0 ) ;
}
