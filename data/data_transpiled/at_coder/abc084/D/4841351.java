public static int INPUT_MAX = 101010 ;
int [ ] isPrime = new int [ INPUT_MAX ] ;
Arrays . fill ( isPrime , 1 ) ;
for ( int i = 2 ;
i < INPUT_MAX ;
i ++ ) {
  if ( ! isPrime [ i ] ) continue ;
  for ( int k = i * 2 ;
  k < INPUT_MAX ;
  k += i ) {
    isPrime [ k ] = 0 ;
  }
}
int [ ] a = new int [ INPUT_MAX ] ;
for ( int i = 0 ;
i < INPUT_MAX ;
i ++ ) {
  if ( i % 2 == 0 ) continue ;
  if ( ( i + 1 ) % 2 != 0 ) continue ;
  if ( isPrime [ i ] && isPrime [ ( int ) ( ( i + 1 ) / 2 ) ] ) a [ i ] = 1 ;
}
int [ ] s = new int [ INPUT_MAX + 1 ] ;
for ( int i = 0 ;
i < INPUT_MAX ;
i ++ ) s [ i + 1 ] = s [ i ] + a [ i ] ;
int Q = Integer . parseInt ( input ( ) ) ;
for ( int q = 0 ;
q < Q ;
q ++ ) {
  int l = Integer . parseInt ( input ( ) ) , r = 1 ;
  System . out . println ( s [ r ] - s [ l ] ) ;
}
return ( s [ l ] - s [ l ] ) ;
}
