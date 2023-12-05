public static int R = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  /* ok k */
  int x = R - k ;
  int y = B - k ;
  /* ok k */
  int low = 0 ;
  int high = Math . min ( R , B ) ;
  while ( high - low > 1 ) {
    int middle = ( high + low ) / 2 ;
    if ( ok ( middle ) ) {
      low = middle ;
    }
    else {
      high = middle ;
    }
  }
  if ( ok ( high ) ) {
    System . out . println ( high ) ;
  }
  else {
    System . out . println ( low ) ;
  }
  return X ;
}
