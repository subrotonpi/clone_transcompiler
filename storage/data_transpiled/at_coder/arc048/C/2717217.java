public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > L = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
}
N = L . size ( ) ;
/* Compute the gcd */
int x ;
if ( N == 1 ) x = 0 ;
else x = L . get ( 1 ) - L . get ( 0 ) ;
for ( int i = 2 ;
i < N ;
i ++ ) x = x + ( x + 1 ) / 2 ;
return MOD ;
}
