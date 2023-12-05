public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ages = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ages [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] indices = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    indices [ i ] = - 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a0 = ages [ i ] - 1 ;
    activated [ a0 ] = true ;
    if ( i >= k - 1 ) {
      if ( cursor > a0 ) {
        do {
          cursor -- ;
          if ( activated [ cursor ] ) {
            break ;
          }
        }
      }
      System . out . println ( indices [ cursor ] + 1 ) ;
    }
  }
}
