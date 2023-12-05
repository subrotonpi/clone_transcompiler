public static int d ( int n ) {
  if ( n < 2 ) return 0 ;
  List < Integer > l = new ArrayList < > ( ) ;
  l . add ( 1 ) ;
  for ( int i = 2 ;
  i <= ( int ) ( n * .5 ) ;
  i ++ ) {
    if ( n % i < 1 ) {
      l . add ( i ) ;
      l . add ( n / i ) ;
    }
  }
  if ( l . size ( ) > 1 && l . get ( l . size ( ) - 1 ) == l . get ( l . size ( ) - 2 ) ) {
    return d ( l . subList ( 0 , l . size ( ) - 1 ) ) ;
  }
  return d ( l ) ;
}
int n = Integer . parseInt ( input ( ) ) ;
int a = d ( n ) ;
if ( n == a ) {
  System . out . println ( "Perfect" ) ;
}
else if ( n > a ) {
  System . out . println ( "Deficient" ) ;
}
else {
  System . out . println ( "Abundant" ) ;
}
