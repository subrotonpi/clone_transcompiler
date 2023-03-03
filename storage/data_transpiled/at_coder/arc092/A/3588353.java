public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] red = new int [ N ] ;
  int [ ] blue = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) red [ i ] = inpl ( ) ;
  Arrays . sort ( red , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return - o1 [ 0 ] < o2 [ 0 ] ? 1 : 0 ;
    }
  }
  ) ;
  Arrays . sort ( blue , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return - o1 [ 0 ] < o2 [ 0 ] ? 1 : 0 ;
    }
  }
  ) ;
  int ans = 0 ;
  for ( int a : red ) {
    int b = blue [ a ] ;
    for ( int c : blue ) {
      int d = blue [ b ] ;
      if ( a < c && b < d ) {
        ans ++ ;
        blue [ a ] = c ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
