static final long MOD = 1000000007 ;
int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] f = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int ff = Integer . parseInt ( input . readLine ( ) ) ;
  f [ i ] = ff ;
}
boolean [ ] flag = new boolean [ m + 1 ] ;
int [ ] dp = new int [ n + 1 ] ;
int cnt = 0 ;
int right = 1 ;
int left = 1 ;
long sum = 0 ;
dp [ 0 ] = 1 ;
while ( ( left < n + 1 ) && ( cnt < n + 1 ) ) {
  while ( right < n + 1 ) {
    if ( ( flag [ f [ right ] ] ) && ( cnt == 1 ) ) break ;
    flag [ f [ right ] ] = true ;
    sum = ( sum + dp [ right - 1 ] ) % MOD ;
    dp [ right ] = sum ;
    right ++ ;
  }
  if ( ( right == n + 1 ) && ( left < n + 1 ) ) break ;
  while ( left < n + 1 ) {
    flag [ f [ left ] ] = false ;
    sum = ( sum - dp [ left - 1 ] ) % MOD ;
    if ( ( f [ left ] == f [ right ] ) && ( cnt == 1 ) ) break ;
    left ++ ;
    left ++ ;
  }
}
System . out . println ( dp [ n ] ) ;
return dp [ n ] ;
}
