public static int N ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int out = 0 ;
  for ( int n : a ) {
    while ( n > 1 ) {
      if ( n % 2 == 0 ) {
        n /= 2 ;
        out ++ ;
      }
      else {
        n = 0 ;
      }
    }
  }
  return out ;
}
