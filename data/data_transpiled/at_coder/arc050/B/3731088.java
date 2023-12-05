public static int R = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  /* able to determine if the input is a positive integer */
  int X = R - x ;
  int Y = B - y ;
  /* X */
  int low = 0 ;
  int high = Math . min ( R , B ) ;
  while ( high > low + 1 ) {
    int mid = ( high + low ) / 2 ;
    if ( x > mid ) {
      low = mid ;
    }
    else {
      high = mid ;
    }
  }
  if ( y > low ) {
    System . out . println ( high ) ;
  }
  else {
    System . out . println ( low ) ;
  }
  return x ;
}
