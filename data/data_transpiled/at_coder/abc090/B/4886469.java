public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  int counter = 0 ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    int now = i ;
    int number = 0 ;
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      int tmp = now % 10 ;
      number += tmp * 10 * ( 4 - j ) ;
      now /= 10 ;
    }
    if ( number == i ) counter ++ ;
  }
  return counter ;
}
