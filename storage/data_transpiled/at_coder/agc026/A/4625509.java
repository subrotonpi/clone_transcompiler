public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int a : input . split ( " " ) ) {
    A [ a ] = Integer . parseInt ( input . substring ( a , a + 1 ) ) ;
  }
  int pre = - 1 ;
  int c = 0 ;
  int ans = 0 ;
  for ( int a : A ) {
    if ( a == pre ) {
      c ++ ;
      if ( c % 2 == 0 ) ans ++ ;
    }
    else {
      c = 1 ;
    }
    pre = a ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
