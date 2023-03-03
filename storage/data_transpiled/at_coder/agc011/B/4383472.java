static final int [ ] binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  Arrays . sort ( a ) ;
  int [ ] a_t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a_t [ i ] = a [ i ] + a_t [ i ] ;
  }
  a_t = Arrays . copyOf ( a_t , 1 ) ;
  int ans = 0 ;
  int mi = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int index = Arrays . binarySearch ( a , a [ i ] * 2 ) - 1 ;
    if ( index == n - 1 ) {
      if ( mi == 0 ) mi = i ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return a_t ;
}
