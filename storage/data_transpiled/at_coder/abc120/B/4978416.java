public static int a , int b , int c ;
int d = Math . max ( a , b ) ;
ArrayList < Integer > l = new ArrayList < Integer > ( ) ;
for ( int i = 1 ;
i <= d ;
i ++ ) {
  if ( a % i == 0 && b % i == 0 ) l . add ( i ) ;
}
return l . get ( l . size ( ) - c ) ;
}
