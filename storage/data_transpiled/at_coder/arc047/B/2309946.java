public static int u0 = v0 = 1e10 ;
int u1 = 0 ;
int v1 = - 1e10 ;
int N = Integer . parseInt ( input ) ;
List < Integer > P = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  P . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
}
for ( int i = 0 ;
i < P . size ( ) ;
i ++ ) {
  int x = P . get ( i ) ;
  int y = P . get ( i ) ;
  u0 = Math . min ( u0 , x + y ) ;
  u1 = Math . max ( u1 , x + y ) ;
  v0 = Math . min ( v0 , x - y ) ;
  v1 = Math . max ( v1 , x - y ) ;
}
final int du = u1 - u0 ;
final int dv = v1 - v0 ;
{
  if ( u1 - du != v1 ) return du ;
}
}
