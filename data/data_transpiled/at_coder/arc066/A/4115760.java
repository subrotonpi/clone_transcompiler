public static int mod ( int mod ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( i ) ;
  }
  if ( N % 2 == 1 ) {
    l . add ( 0 ) ;
    N -- ;
  }
  else {
    l . remove ( 0 ) ;
  }
  l . sort ( ) ;
  int i = 0 ;
  for ( int f = l . size ( ) - 1 ;
  f > 0 ;
  f = l . get ( f ) ) {
    i ++ ;
  }
  return i ;
}
