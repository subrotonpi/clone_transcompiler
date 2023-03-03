public static void f ( int a , int b , int k ) {
  for ( String s : input . split ( " " ) ) {
    int [ ] numbers = new int [ s ] ;
    for ( int i = 1 ;
    i <= s ;
    i ++ ) {
      if ( s % i == 0 && l % i == 0 ) {
        numbers [ k ] = i ;
      }
    }
    System . out . println ( numbers [ k ] ) ;
  }
  if ( a > b ) {
    f ( b , a , k ) ;
  }
  else {
    f ( a , b , k ) ;
  }
}
