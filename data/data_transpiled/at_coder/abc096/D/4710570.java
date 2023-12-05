static int n = Integer . parseInt ( input . nextLine ( ) ) {
  int i = 2 ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      return false ;
    }
    i ++ ;
  }
  return i ;
}
