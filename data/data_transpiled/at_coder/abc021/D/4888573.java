static int m = 10 * * 9 + 7 ;
int n = 1 ;
int k = 1 ;
for ( int i = 0 ;
i < b ;
i ++ ) {
  r = r * ( n + k - 1 - i ) * Math . pow ( i + 1 , m - 2 , m ) % m ;
}
