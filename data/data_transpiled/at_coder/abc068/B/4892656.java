public static int a ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxCount = 0 ;
  int maxNumber = 1 ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    int count = 0 ;
    int hold = i ;
    while ( i % 2 == 0 ) {
      count ++ ;
      i /= 2 ;
    }
    if ( count > maxCount ) {
      maxCount = count ;
      maxNumber = hold ;
    }
  }
  return maxNumber ;
}
