public static int [ ] getDigits ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ s ] ;
  int i = 0 ;
  do {
    if ( a [ i ] % 2 == 0 ) {
      a [ i ] = a [ i ] / 2 ;
    }
    else {
      a [ i ] = 3 * a [ i ] + 1 ;
    }
    i ++ ;
  }
  while ( a [ i ] >= 0 ) ;
  if ( a [ i ] >= 0 ) {
    System . out . println ( Integer . toString ( i + 1 ) ) ;
    exit ( ) ;
  }
  return a ;
}
