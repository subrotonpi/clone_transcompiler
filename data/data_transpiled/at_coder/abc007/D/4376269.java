@ VisibleForTesting static LinkedHashMap < Integer , Integer > input ( ) {
  final LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  final int [ ] [ ] li = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int [ ] [ ] II = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int [ ] [ ] LS = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int [ ] [ ] S = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int [ ] IIR = Arrays . asList ( II ) ;
  final int [ ] LIR = Arrays . asList ( LI ) ;
  final int [ ] SR = Arrays . asList ( S ) ;
  final int mod = 1000000007 ;
  final int [ ] a = LS . toArray ( ) ;
  final int [ ] b = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  for ( int i = 0 ;
  i < b . length - a . length ;
  i ++ ) a [ i ] = 0 ;
  final int n = b . length ;
  final int [ ] [ ] [ ] dp = new int [ n ] [ 2 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) for ( int k = 0 ;
  k < n ;
  k ++ ) for ( int h = 0 ;
  h < n ;
  h ++ ) {
    int x = j > 0 ? 0 : a [ i ] ;
    int y = k > 0 ? 9 : b [ i ] ;
    for ( int d = x ;
    d <= y ;
    d ++ ) dp [ i + 1 ] [ j || d > a [ i ] ] [ k || d < b [ i ] ] [ h || d == 4 || d == 9 ] += dp [ i ] [ j ] [ k ] [ h ] ;
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) for ( int k = 0 ;
  k < n ;
  k ++ ) ans += dp [ n ] [ j ] [ k ] [ 1 ] ;
  return map ;
}
