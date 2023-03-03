public static int [ ] getmnsk ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  mnsk = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int h = 1 ;
    h <= i ;
    h ++ ) {
      if ( i * h <= n ) {
        mnsk [ h ] = n - i * h + Math . abs ( i - h ) ;
      }
      else {
        break ;
      }
    }
  }
  System . out . println ( min ( mnsk ) ) ;
  return mnsk ;
}
