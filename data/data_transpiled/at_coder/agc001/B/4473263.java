public static int n , x ;
int k ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
/* if (a % b == 0) return b; else return gcd(b, a%b); */
k = gcd ( n , x ) ;
if ( k == 1 ) {
  System . out . println ( ( n - 1 ) * 3 ) ;
}
else {
  System . out . println ( ( ( int ) ( n / k ) - 1 ) * 3 * k ) ;
}
return k ;
}
