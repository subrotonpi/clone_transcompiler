static private long p = 1000000007 ;
long n = Long . parseLong ( input ) ;
long k = Long . parseLong ( input ) ;
long [ ] a = new long [ k + 1 ] ;
a [ 1 ] = 1 ;
for ( int i = 2 ;
i <= k ;
i ++ ) {
  a [ i ] = a [ p % i ] * ( p - p / i ) % p ;
}
long s = 1 ;
for ( int j = 0 ;
j < k ;
j ++ ) {
  s = s * ( n + k - 1 - j ) % p ;
  s = s * a [ j + 1 ] % p ;
}
System . out . println ( s ) ;
return s ;
}
