public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input . readLine ( ) ) ;
int A = Integer . parseInt ( input . readLine ( ) ) ;
int B = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] a = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
Arrays . sort ( a ) ;
if ( A == 1 ) {
  for ( int x : a ) System . out . println ( x % MOD ) ;
}
else {
  while ( B > 0 && max ( a ) >= a [ 0 ] * A ) {
    a [ 0 ] *= A ;
    Arrays . sort ( a ) ;
    B -- ;
  }
  int [ ] powers = new int [ B / N ] ;
  for ( int i = 0 ;
  i < B % N ;
  i ++ ) powers [ i ] ++ ;
  for ( int i = B % N ;
  i < N ;
  i ++ ) {
    int x = a [ i ] , p = powers [ i ] ;
    System . out . println ( ( x * pow ( A , p , MOD ) ) % MOD ) ;
  }
  for ( int i = 0 ;
  i <= B % N ;
  i ++ ) {
    int x = a [ i ] , p = powers [ i ] ;
    System . out . println ( ( x * pow ( A , p , MOD ) ) % MOD ) ;
  }
}
