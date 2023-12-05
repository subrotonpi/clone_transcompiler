static final long M = 1000000007 ;
int H = Integer . parseInt ( input . readLine ( ) ) , W = Integer . parseInt ( input . readLine ( ) ) , A = Integer . parseInt ( input . readLine ( ) ) , B = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] factorialArray = new int [ H + W ] ;
factorialArray [ 0 ] = 1 ;
for ( int i = 1 ;
i <= H ;
i ++ ) {
  factorialArray [ i ] = factorialArray [ i - 1 ] * i % M ;
}
int [ ] inverseFactorialArray = new int [ H + W ] ;
/* power of a and b */
for ( int i = 0 ;
i < H ;
i ++ ) {
  inverseFactorialArray [ i ] = factorialArray [ i ] * factorialArray [ i ] % M ;
}
/* if (n == 0) {
return 1;
}*/
if ( n == 1 ) {
  return a % M ;
}
if ( n % 2 == 0 ) {
  return power ( a , n / 2 ) * a % M ;
}
/* if (n % 2 == 0) {
return power(a, n/2)*a%M;
}*/
inverseFactorialArray [ H + W - 1 ] = power ( factorialArray [ H + W - 1 ] , M - 2 ) ;
for ( int i = H + W - 2 ;
i >= 0 ;
i -- ) {
  inverseFactorialArray [ i ] = inverseFactorialArray [ i + 1 ] * ( i + 1 ) % M ;
}
/* C */
int a = factorialArray [ a + b ] * inverseFactorialArray [ a ] * inverseFactorialArray [ b ] % M ;
int route = 0 ;
for ( int i = B ;
i < W ;
i ++ ) {
  int a = H - A - 1 ;
  int b = i ;
  int c = A - 1 ;
  int d = W - i - 1 ;
  route += ( ( C ( a , b ) % M ) * ( C ( c , d ) % M ) ) ;
  route %= M ;
}
return route ;
}
