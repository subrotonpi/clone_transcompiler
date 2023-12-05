public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x % d != 0 || y % d != 0 ) {
    return ;
  }
  x = Math . abs ( x / d ) ;
  y = Math . abs ( y / d ) ;
  int m = n - x - y ;
  if ( m < 0 || m % 2 != 0 ) {
    return ;
  }
  double ans = 0.0 ;
  for ( int rl = x ;
  rl <= x + m ;
  rl += 2 ) {
    int r = ( x + rl ) / 2 ;
    int l = rl - r ;
    int tb = n - rl ;
    int t = ( y + tb ) / 2 ;
    int b = tb - t ;
    double p = 1.0 ;
    int i = 1 ;
    for ( int j = 1 ;
    j <= r ;
    j ++ ) {
      p *= i / ( 4.0 * j ) ;
      i ++ ;
    }
    for ( int j = 1 ;
    j <= l ;
    j ++ ) {
      p *= i / ( 4.0 * j ) ;
      i ++ ;
    }
    for ( int j = 1 ;
    j <= t ;
    j ++ ) {
      p *= i / ( 4.0 * j ) ;
      i ++ ;
    }
    for ( int j = 1 ;
    j <= b ;
    j ++ ) {
      p *= i / ( 4.0 * j ) ;
      i ++ ;
    }
    ans += p ;
  }
  System . out . println ( main ( ) ) ;
}
