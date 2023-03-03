public static int a ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = a ;
  int t = 0 ;
  if ( k == 0 ) {
    System . out . println ( 2 * ( 10 * 12 ) - a ) ;
    exit ( ) ;
  }
  else {
    while ( s < 2 * ( 10 * 12 ) ) {
      s ++ + k * s ;
      t ++ ;
    }
  }
  return s ;
}
