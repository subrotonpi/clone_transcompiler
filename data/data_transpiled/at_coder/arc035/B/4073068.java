public static int P = 10 * 9 + 7 ;
int N = Integer . parseInt ( input ) ;
List < Integer > t = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) t . add ( Integer . parseInt ( input ) ) ;
int [ ] S = new int [ N + 1 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) S [ i + 1 ] = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) S [ i + 1 ] = S [ i ] + t . get ( i ) ;
int [ ] Fact = new int [ N + 1 ] ;
for ( int i = 0 ;
i < N + 1 ;
i ++ ) Fact [ i + 1 ] = ( ( i + 1 ) * Fact [ i ] ) % P ;
Map < Integer , Integer > D = Maps . newHashMap ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( D . containsKey ( t . get ( i ) ) ) D . put ( t . get ( i ) , 1 ) ;
  else D . put ( t . get ( i ) , 1 ) ;
}
System . out . println ( S ) ;
int ans = 1 ;
for ( Integer k : D . keySet ( ) ) {
  int m = D . get ( k ) ;
  ans *= Fact [ m ] ;
  ans %= P ;
}
return ans ;
}
