static final int [ ] getLengths ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  dic . put ( 0 , 1 ) ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tmp = ( tmp + a [ i ] ) % M ;
    if ( tmp >= M ) dic . put ( tmp , 1 ) ;
    else dic . putIfAbsent ( tmp , 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans += dic . get ( i ) * ( dic . get ( i ) - 1 ) / 2 ;
  System . out . println ( ans ) ;
  return ans ;
}
