public static int n ( ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 1 ;
  int pre = a [ 0 ] ;
  int res = 0 ;
  for ( int i = 1 ;
  i < count ;
  i ++ ) res += a [ i ] ;
  return res ;
}
