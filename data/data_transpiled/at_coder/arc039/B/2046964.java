public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
/* N = 1 */
int res = 1 ;
k = Math . min ( n , n - k ) ;
for ( int i = 0 ;
i < k ;
i ++ ) {
  res *= ( n - i ) ;
}
for ( int i = 0 ;
i < k ;
i ++ ) {
  res /= ( k - i ) ;
}
return res ;
}
