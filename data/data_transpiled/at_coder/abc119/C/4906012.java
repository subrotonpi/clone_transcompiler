public static int n ( int a , int b , int c ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Find the first two numbers */
  if ( i == n ) {
    return Math . min ( A , B , C ) > 0 ? Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) : 9999999999999999999999999999 ;
  }
  else {
    return Math . min ( find ( i + 1 , A , B , C ) , find ( i + 1 , A + l [ i ] , B , C ) + ( A > 0 ? 10 : 0 ) ) ;
  }
}
