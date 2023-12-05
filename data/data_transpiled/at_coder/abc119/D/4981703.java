public static int [ ] [ ] solve ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int s [ ] = new int [ A ] ;
  int t [ ] = new int [ B ] ;
  int x [ ] = new int [ Q ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) s [ i ] = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) t [ i ] = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) x [ i ] = Integer . parseInt ( input ) ;
  final int INT_MAX = Integer . MAX_VALUE ;
  s [ 0 ] = - 1 * INT_MAX ;
  s [ 1 ] = INT_MAX ;
  t [ 0 ] = - 1 * INT_MAX ;
  t [ 1 ] = INT_MAX ;
  final int ans ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    int xi = x [ i ] ;
    int si = Math . min ( s [ i ] , x [ i ] ) ;
    int ti = Math . min ( t [ i ] , x [ i ] ) ;
    int sa = s [ si ] ;
    int ta = t [ ti ] ;
    int sb = s [ si - 1 ] ;
    int tb = t [ ti - 1 ] ;
    ans = Math . min ( Math . abs ( xi - sa ) + Math . abs ( sa - ta ) , Math . abs ( xi - sa ) + Math . abs ( sa - tb ) , Math . abs ( xi - sb ) + Math . abs ( sb - ta ) , Math . abs ( sb - tb ) ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
