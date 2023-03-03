static final int N = input . nextInt ( ) ;
int n = Math . ceil ( Math . sqrt ( N ) ) ;
int a = 0 ;
int b = 0 ;
for ( int i = 1 ;
i <= n ;
i ++ ) {
  if ( N % i == 0 ) {
    a = i ;
    b = N / i ;
    break ;
  }
}
return a ;
}
