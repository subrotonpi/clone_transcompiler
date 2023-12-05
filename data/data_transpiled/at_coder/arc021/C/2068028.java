public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  {
    int mid ;
    int res = 0 ;
    for ( int a = 0 ;
    a < C . size ( ) ;
    a ++ ) {
      int d = C . get ( a ) ;
      if ( mid < a ) continue ;
      res += 1 + ( mid - a ) / d ;
    }
    return res ;
  }
  int left = 0 ;
  int right = 10 * 12 ;
  while ( left + 1 < right ) {
    int mid = ( left + right ) / 2 ;
    if ( solve ( mid ) < K ) left = mid ;
    else right = mid ;
  }
  int b = right ;
  int ans = 0 ;
  int su = 0 ;
  for ( int a = 0 ;
  a < C . size ( ) ;
  a ++ ) {
    int d = C . get ( a ) ;
    if ( b < a ) continue ;
    int k = 1 + ( b - a ) / d ;
    su += k ;
    ans += a * k + k * ( k - 1 ) / 2 * d ;
  }
  System . out . println ( ans - ( su - K ) * b ) ;
  return ans ;
}
