public static int x ( ) {
  int x = Integer . parseInt ( input ( ) ) ;
  int i = 1 ;
  int t = 1 ;
  while ( x > t ) {
    i ++ ;
    t += i ;
  }
  return i ;
}
