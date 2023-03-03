public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = 0 ;
  if ( b == 0 ) {
    System . out . println ( 2 * 10 * 12 - a ) ;
    exit ( ) ;
  }
  while ( a < 2 * 10 * 12 ) {
    a ++ + b * a ;
    c ++ ;
  }
  return c ;
}
