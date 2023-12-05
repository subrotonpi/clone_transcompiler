public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] [ 0 ] = i ;
  }
  Arrays . sort ( A , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 1 ] - o2 [ 1 ] ;
    }
  }
  ) ;
  int cnt = 0 ;
  A [ 0 ] [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( A [ i - 1 ] [ 1 ] != A [ i ] [ 1 ] ) ++ cnt ;
    A [ i ] [ 1 ] = cnt ;
  }
  Arrays . sort ( A , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 0 ] - o2 [ 0 ] ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( A [ i ] [ 2 ] ) ;
  }
}
