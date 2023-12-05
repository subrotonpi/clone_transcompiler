public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = input . nextLine ( ) ;
  if ( n % 2 == 0 || s . length ( ) % 2 == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int T = ( n - 1 ) / 2 ;
    String temp = "b" ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      if ( i % 3 == 1 ) temp = "a" + temp + "c" ;
      else if ( i % 3 == 2 ) temp = "c" + temp + "a" ;
      else temp = "b" + temp + "b" ;
    }
    if ( s . equals ( temp ) ) System . out . println ( T ) ;
    else System . out . println ( - 1 ) ;
  }
}
