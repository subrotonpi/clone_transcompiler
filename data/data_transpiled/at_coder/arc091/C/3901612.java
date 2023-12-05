public static void print ( int n , int m , int k ) {
  if ( ! m + k - 1 <= n && n <= m * k ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int [ ] streak = new int [ k ] ;
  streak [ 0 ] = 1 ;
  streak [ 1 ] = m ;
  int i = 1 ;
  for ( int increment = 0 ;
  increment < n - m - k + 1 ;
  increment ++ ) {
    if ( streak [ i ] == m ) i ++ ;
    streak [ i ] ++ ;
  }
  List < Integer > list = Lists . newArrayList ( ) ;
  i = 0 ;
  for ( int s : streak ) {
    int [ ] subseq = list . subList ( i , s ) ;
    list . set ( i , subseq , 0 , subseq . length - 1 ) ;
    i += s ;
  }
  System . out . println ( ( int ) list ) ;
}
