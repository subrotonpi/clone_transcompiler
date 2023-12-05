public static int [ ] [ ] red ( ) {
  int [ ] [ ] red = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    red [ i ] [ 0 ] = a ;
    red [ i ] [ 1 ] = b ;
  }
  int [ ] [ ] blue = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    blue [ i ] [ 0 ] = c ;
    blue [ i ] [ 1 ] = d ;
  }
  Arrays . sort ( red , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return ( o2 . intValue ( ) > red [ n - 1 - k ] [ 0 ] ? 1 : 0 ) ;
    }
  }
  ) ;
  Arrays . sort ( blue , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return ( o1 . intValue ( ) > blue [ o1 . intValue ( ) ] ? 1 : 0 ) ;
    }
  }
  ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( blue [ i ] [ 0 ] > red [ n - 1 - k ] [ 0 ] && blue [ i ] [ 1 ] > red [ n - 1 - k ] [ 1 ] ) {
        ans ++ ;
        red [ n - 1 - k ] [ 0 ] = 2000 ;
        red [ n - 1 - k ] [ 1 ] = 2000 ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return red ;
}
