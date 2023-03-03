public static String N = Integer . parseInt ( input ) {
  int [ ] [ ] travel = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) travel [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  String ans = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int dt = travel [ i + 1 ] [ 0 ] - travel [ i ] [ 0 ] ;
    int dx = Math . abs ( travel [ i + 1 ] [ 1 ] - travel [ i ] [ 1 ] ) ;
    int dy = Math . abs ( travel [ i + 1 ] [ 2 ] - travel [ i ] [ 2 ] ) ;
    if ( dx + dy <= dt && ( dx + dy ) % 2 == dt % 2 ) {
      continue ;
    }
    else {
      ans = "No" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
