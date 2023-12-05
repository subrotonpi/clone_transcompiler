public static int N ( ) {
  int [ ] As = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  int state = 0 ;
  int beforeA = As [ 0 ] ;
  for ( int i = 0 ;
  i < As . length ;
  i ++ ) {
    if ( As [ i ] > beforeA ) {
      if ( state == 0 || state == 1 ) {
        state = 1 ;
      }
      else {
        count ++ ;
        state = 0 ;
      }
    }
    beforeA = As [ i ] ;
  }
  return count + 1 ;
}
