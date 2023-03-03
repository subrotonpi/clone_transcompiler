public static int solve ( String S ) {
  String C = S ;
  int N = S . length ( ) ;
  int a ;
  if ( C . charAt ( 0 ) == '0' ) {
    int cnt = 1 ;
    while ( cnt < N && C . charAt ( cnt ) == '0' ) ++ cnt ;
    C = C . substring ( cnt ) ;
    a = 10 * cnt ;
  }
  else {
    int cnt = 1 ;
    while ( cnt < N && C . charAt ( cnt ) == '0' ) ++ cnt ;
    a = Integer . parseInt ( C . substring ( 0 , cnt ) ) ;
    C = C . substring ( cnt ) ;
  }
  int L = C . length ( ) ;
  int d = 1 ;
  int b ;
  int p ;
  int numl ;
  int numr ;
  int d0 ;
  int b ;
  int p ;
  int j ;
  int i ;
  int d0 ;
  int numr ;
  for ( i = p ;
  i < L ;
  i ++ ) {
    b = Integer . parseInt ( C . substring ( i , i + 1 ) ) - a ;
    b = Integer . parseInt ( C . substring ( 0 , i ) ) ;
    p ++ ;
    while ( p < L && ( b <= a || C . charAt ( p ) == '0' ) ) {
      b = b * 10 + Integer . parseInt ( C . substring ( p ++ , i + 1 ) ) ;
    }
    if ( p == L ) {
      numl = numr = b ;
      while ( numr <= a ) {
        numl *= 10 ;
        numr = numr * 10 + 9 ;
      }
      d = Math . max ( numl - a , 1 ) ;
    }
    for ( i = p ;
    i < L ;
    i ++ ) {
      if ( C . charAt ( i ) == '0' ) {
        b = b * 10 + Integer . parseInt ( C . substring ( i , i + 1 ) ) ;
        continue ;
      }
      d0 = b - a ;
      nxt = a + d0 + d0 ;
      numl = numr = 0 ;
      j = i ;
      while ( j < L || 0 < numr && numr < nxt ) {
        if ( L <= j ) {
          numl = 10 * numl ;
          numr = 10 * numr + 9 ;
        }
        else {
          numl = 10 * numl + Integer . parseInt ( C . substring ( j , i + 1 ) ) ;
          numr = 10 * numr + Integer . parseInt ( C . substring ( j , i + 1 ) ) ;
        }
        if ( numl <= nxt && num @ @