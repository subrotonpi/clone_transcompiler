public static int N = Integer . parseInt ( input ) + 1 ;
int L = Integer . parseInt ( String . valueOf ( N ) ) ;
int ans = 0 ;
for ( int i = 1 ;
i <= L ;
i ++ ) {
  int c = ( N / 10 * i ) * 10 * ( i - 1 ) ;
  int r = N % 10 * i - 10 * ( i - 1 ) ;
  ans += c ;
  if ( r > 0 ) {
    ans += Math . min ( 10 * ( i - 1 ) , r ) ;
  }
}
System . out . println ( ans ) ;
return ans ;
}
