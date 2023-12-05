public static boolean solve ( int N , int M , int A , int B ) {
  int n , m , a , b ;
  if ( a * 2 + b * 2 > n * m ) {
    return false ;
  }
  else {
    char [ ] [ ] ans = new char [ M ] [ n ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      ans [ i ] [ 0 ] = '.' ;
    }
    int remainA = a ;
    int remainB = b ;
    int nx = 0 ;
    int ny = 0 ;
    int gx = n ;
    int gy = m ;
    if ( n % 2 != 0 ) {
      nx = 1 ;
      int cnt = 0 ;
      do {
        if ( cnt > m - 2 || remainA == 0 ) break ;
        ans [ 0 ] [ cnt ] = '<' ;
        ans [ 0 ] [ cnt + 1 ] = '>' ;
        return false ;
      }
      while ( true ) ;
    }
    while ( true ) ;
    if ( remainA % 2 == 1 ) {
      ans [ 0 ] [ ny ] = '^' ;
      ans [ 0 ] [ ny + 1 ] = '>' ;
      return false ;
    }
    ans [ nx ] [ ny ] = '<' ;
    ans [ ny + 1 ] = '>' ;
    return true ;
  }
  else if ( remainA % 2 == 1 ) {
    ans [ 0 ] [ ny ] = '<' ;
    ans [ 0 ] [ ny + 1 ] = '>' ;
    return false ;
  }
  else if ( remainB % 2 == 0 ) {
    ans [ 0 ] [ ny ] = '^' ;
    ans [ 0 ] [ ny ] = '>' ;
    return false ;
  }
  int cnt = 0 ;
  do {
    if ( cnt > n - 2 || remainB == 0 ) break ;
    ans [ cnt ] [ m - 1 ] = '^' ;
    ans [ cnt + 1 ] [ m - 1 ] = '>' ;
    return false ;
  }
  while ( true ) ;
  if ( ( n == 1 || m == 1 ) && ( remainA > 0 || remainB > 0 ) ) return false ;
  int cna = remainA ;
  int cnb = remainB ;
  for ( int i = 0 ;
  i < cnb / 2 ;
  i ++ ) {
    ans [ nx ] [ ny ] = '^' ;
    ans [ nx + 1 ] [ ny ] = '>' ;
    ans [ nx + 1 ] [ ny + 1 ] = '>' ;
    return