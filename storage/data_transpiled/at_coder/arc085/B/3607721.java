static final int [ ] getStdIn ( ) {
  final String fin = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( fin ) ;
  final int Z = Integer . parseInt ( fin ) ;
  final int W = Integer . parseInt ( fin ) ;
  final int [ ] aArray = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aArray [ i ] = Integer . parseInt ( fin ) ;
  }
  assert aArray . length == N ;
  if ( N == 1 ) {
    System . out . println ( Math . abs ( aArray [ N - 1 ] - W ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( aArray [ N - 1 ] - W ) , Math . abs ( aArray [ N - 2 ] - aArray [ N - 1 ] ) ) ) ;
  }
  return aArray ;
}
