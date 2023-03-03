public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = i ;
  }
  int total = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      total += max ( a ) ;
      int index = a . length - 1 ;
      a [ index ] = 0 ;
    }
  }
  return total ;
}
