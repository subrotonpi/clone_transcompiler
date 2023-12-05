public static int N , x ;
int [ ] l = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  l [ i ] = input . nextInt ( ) ;
}
if ( x == 1 || x == 2 * N - 1 ) {
  System . out . println ( "No" ) ;
  exit ( ) ;
}
System . out . println ( "Yes" ) ;
if ( N == 2 && x == 2 ) {
  l [ 0 ] = 1 ;
  l [ 1 ] = 2 ;
  l [ 2 ] = 3 ;
  System . out . println ( ( int ) l [ 0 ] + "\n" ) ;
}
else if ( x == 2 ) {
  l [ 0 ] = 4 ;
  l [ 1 ] = 1 ;
  l [ 2 ] = 3 ;
  List < Integer > rest = Lists . newArrayList ( 5 , 2 * N ) ;
  int m = rest . size ( ) / 2 ;
  l = rest . subList ( 0 , m ) . addAll ( l ) . addAll ( rest ) . subList ( m , m ) ;
  System . out . println ( ( int ) l [ 0 ] + "\n" ) ;
}
else if ( x == 2 * N - 2 ) {
  l [ 0 ] = x - 2 ;
  l [ 1 ] = x + 1 ;
  l [ 2 ] = x ;
  rest = Lists . newArrayList ( 1 , 2 * N - 4 ) ;
  int m = rest . size ( ) / 2 ;
  l = rest . subList ( 0 , m ) . addAll ( l ) . subList ( m , m ) ;
  System . out . println ( ( int ) l [ 0 ] + "\n" ) ;
}
else {
  l [ 0 ] = x + 2 ;
  l [ 1 ] = x - 1 ;
  l [ 2 ] = x + 1 ;
  rest = Lists . newArrayList ( x + 3 , 2 * N ) ;
  int m = rest . size ( ) / 2 ;
  l = rest . subList ( 0 , m ) . addAll ( l ) . subList ( m , m ) ;
  System . out . println ( ( int ) l [ 0 ] + "\n" ) ;
}
return x ;
}
