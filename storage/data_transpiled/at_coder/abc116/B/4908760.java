public static void main ( String input ) {
  int s = Integer . parseInt ( input ) ;
  int [ ] a = new int [ s ] ;
  int i = 1 ;
  do {
    i ++ ;
    if ( a [ a . length - 1 ] % 2 == 0 ) a [ a . length - 1 ] = a [ a . length - 1 ] / 2 ;
    else a [ a . length - 1 ] = 3 ;
  }
  while ( true ) ;
}
