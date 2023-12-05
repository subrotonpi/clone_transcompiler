public static long ncr ( int n , int r ) {
  r = Math . min ( n - r , r ) ;
  long up = 1 ;
  long down = 1 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    up *= ( n - i ) ;
    down *= ( i + 1 ) ;
  }
  return up / down ;
  /* seq */
  long s = 0 ;
  for ( int i = 1 ;
  i < x ;
  i ++ ) {
    int j = i * 2 ;
    if ( j > x ) break ;
    s += ncr ( x , j ) ;
  }
  /* ins */
  long s = 0 ;
  for ( int i = p + 1 ;
  i < total ;
  i ++ ) s += ncr ( p , i ) * ncr ( total - p , i ) ;
  /* return s */
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = 1 ;
  for ( int i = 41 ;
  i > 0 ;
  i -- ) {
    int x = seq ( i ) ;
    if ( N >= x ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) ans . add ( k ) ;
      N -= x ;
      k ++ ;
      break ;
    }
  }
  int size = ans . size ( ) ;
  int s = size / 2 ;
  while ( N > 90 ) {
    int m = 0 ;
    int t = 0 ;
    for ( int i = 0 ;
    i < s + 1 ;
    i ++ ) {
      int tmp = ins ( size , i ) ;
      if ( tmp > N ) break ;
      if ( tmp > t ) {
        t = tmp ;
        m = i ;
      }
    }
    N -= t ;
    ans . add ( m , k ) ;
    ans . add ( k ) ;
    k ++ ;
  }
  while ( N > 0 ) {
    for ( int i = 41 ;
    i > 0 ;
    i -- ) {
      int x = seq ( i ) ;
      if ( N >= x ) {
        for ( int j = 0 ;
        j < i ;
        j ++ ) ans . add ( k ) ;
        N -= x ;
        k ++ ;
        break ;
      }
    }
  }
  System . out . println ( ans . size ( ) ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
  return s ;
}
