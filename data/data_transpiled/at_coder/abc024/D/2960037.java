public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int mod = 10 * * 9 + 7 ;
/* if (n == 1) return x; */
int d = n / 2 ;
int m = n % 2 ;
int p = Math . pow ( d , m ) ;
return ( p * p * ( m == 1 ? 1 : 0 ) ) % mod ;
}
