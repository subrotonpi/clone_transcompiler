static final int N = input . nextInt ( ) ;
int n = ( int ) Math . sqrt ( N ) ;
double ans = Double . POSITIVE_INFINITY ;
for ( int i = 1 ;
i <= n ;
i ++ ) {
  if ( ( N % i ) == 0 ) {
    int a , b ;
    a = i ;
    b = N / i ;
    a = String . valueOf ( a ) ;
    b = String . valueOf ( b ) ;
    int tmp = Math . max ( a . length ( ) , b . length ( ) ) ;
    ans = Math . min ( ans , tmp ) ;
  }
}
System . out . println ( ans ) ;
}
