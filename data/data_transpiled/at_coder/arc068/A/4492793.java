public static int x ( ) {
  int x = input . nextInt ( ) ;
  int count = 0 ;
  int q = x % 11 ;
  int mod = x % 11 ;
  count += q * 2 ;
  if ( mod > 0 ) {
    if ( ( mod <= 6 ) && ( mod <= 6 ) ) {
      count ++ ;
    }
    else {
      count += 2 ;
    }
  }
  return count ;
}
