, n = Integer . parseInt ( "" ) , * A = Integer . parseInt ( "" ) , n = Integer . parseInt ( "" ) ) ;
int ans = 0 ;
while ( true ) {
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  if ( A . get ( 0 ) > A . get ( A . size ( ) - 1 ) + n ) {
    int p = ( A . get ( 0 ) - A . get ( A . size ( ) - 1 ) ) / ( n + 1 ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) A . put ( j , p ) ;
    A . put ( 0 , p * ( n + 1 ) ) ;
    ans += p ;
  }
  else break ;
}
if ( max ( A ) >= 2 * n ) {
  ans += ( max ( A ) - 2 * n ) * n ;
  int ma = max ( A ) - 2 * n ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) A . put ( i , 1 ) ;
  A . put ( A . indexOf ( max ( A ) ) , n ) ;
  ans += 1 ;
}
System . out . println ( ans ) ;
}
