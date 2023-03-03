public static int N = 150 ;
int p = 13 ;
int cnt = 0 ;
System . out . println ( N ) ;
for ( int l = 0 ;
l < N ;
l ++ ) {
  int i = l / p ;
  int j = l % p ;
  char [ ] tmp = new char [ p * p ] ;
  for ( int k = 0 ;
  k < p ;
  k ++ ) tmp [ p * k + ( ( i * k + j ) % p ) ] = 'O' ;
  System . out . println ( ( char ) ( tmp [ 0 ] ) ) ;
}
return cnt ;
}
