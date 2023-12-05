public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] heights = new int [ n ] ;
  for ( int i = 0 ;
  i < heights . length ;
  i ++ ) {
    heights [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( heights ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i + k - 1 >= heights . length ) break ;
    ans = Math . min ( ans , heights [ i + k - 1 ] - heights [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
