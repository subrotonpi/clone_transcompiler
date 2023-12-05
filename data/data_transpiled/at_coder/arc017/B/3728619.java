public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int i0 = 0 ;
  int r = 0 ;
  int a = 0 ;
  for ( ;
  ;
  ) {
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i > i0 ) {
      r ++ ;
    }
    else {
      r = 1 ;
    }
    if ( r >= K ) {
      a ++ ;
    }
    i0 = i ;
  }
  System . out . println ( a ) ;
  return a ;
}
