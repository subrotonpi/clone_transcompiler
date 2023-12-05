public static int MOD = 10 * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] C = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] dp = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) dp [ i ] = 0 ;
dp [ 0 ] = 1 ;
HashMap < Integer , Integer > color = new HashMap < Integer , Integer > ( ) ;
for ( int c : C ) color . put ( c , 0 ) ;
return dp [ N - 1 ] ;
}
