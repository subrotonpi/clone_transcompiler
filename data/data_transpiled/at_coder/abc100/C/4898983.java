public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] an = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    an [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int count = 0 ;
  for ( int a : an ) {
    while ( a % 2 == 0 ) {
      count ++ ;
      a = a / 2 ;
    }
  }
  System . out . println ( count ) ;
  return count ;
}
