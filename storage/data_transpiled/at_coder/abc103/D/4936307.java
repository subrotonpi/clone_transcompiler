public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ M ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A [ i ] [ 0 ] = 0 ;
    A [ i ] [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return ( o1 [ 1 ] < o2 [ 0 ] ? - 1 : 1 ) ;
    }
  }
  ) ;
  int ans = 0 ;
  int x = 0 ;
  for ( int [ ] a : A ) {
    if ( x < a [ 0 ] ) {
      x = a [ 1 ] - 1 ;
      ans ++ ;
    }
  }
  return ans ;
}
