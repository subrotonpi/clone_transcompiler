public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input ) ;
int [ ] a = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) a [ i ] = Integer . parseInt ( input ) ;
HashMap < Integer , Integer > last = new HashMap < Integer , Integer > ( ) ;
HashMap < Integer , Integer > tmp = new HashMap < Integer , Integer > ( ) ;
int ans = 1 ;
int x = a [ 0 ] ;
last . put ( x , 0 ) ;
tmp . put ( x , 1 ) ;
for ( int i = 1 ;
i < N ;
i ++ ) {
  x = a [ i ] ;
  last . putIfAbsent ( x , i ) ;
  tmp . putIfAbsent ( x , 0 ) ;
  if ( last . get ( x ) != i - 1 ) ans += tmp . get ( x ) ;
  last . put ( x , i ) ;
  tmp . put ( x , ans % MOD ) ;
  ans = ans % MOD ;
}
System . out . println ( ans ) ;
return ans ;
}
