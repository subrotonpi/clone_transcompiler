public static void main ( String input , int k ) {
  int a = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  if ( k == 0 ) {
    System . out . println ( 2 * 10 * 12 - a ) ;
  }
  else {
    int count = 0 ;
    while ( a < 2 * 10 * 12 ) {
      count ++ ;
      a ++ + a * k ;
    }
    System . out . println ( count ) ;
  }
}
