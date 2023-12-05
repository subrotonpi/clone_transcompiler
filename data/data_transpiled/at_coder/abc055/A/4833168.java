public static int N = Integer . parseInt ( input ) {
  int count = 0 ;
  int morta = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count += 800 ;
    if ( ( i + 1 ) % 15 == 0 ) {
      morta += 200 ;
    }
  }
  System . out . println ( count - morta ) ;
  return count ;
}
