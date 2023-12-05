public static final String [ ] [ ] readAllLines ( ) {
  final BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter writer = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final int N = Integer . parseInt ( reader . readLine ( ) ) ;
  final int M = Integer . parseInt ( reader . readLine ( ) ) ;
  final List < List < Integer >> cities = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int p = Integer . parseInt ( reader . readLine ( ) ) ;
    final int y = Integer . parseInt ( reader . readLine ( ) ) ;
    final List < Integer > temp = new ArrayList < > ( ) ;
    temp . add ( p ) ;
    temp . add ( y ) ;
    temp . add ( i ) ;
    cities . add ( temp ) ;
  }
  final int [ ] id = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    id [ i ] = 1 ;
  }
  final List < Integer > sortedCities = new ArrayList < > ( cities ) ;
  Collections . sort ( sortedCities ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    sortedCities . get ( i ) . add ( id [ sortedCities . get ( i ) . intValue ( ) - 1 ] ) ;
    id [ sortedCities . get ( i ) . intValue ( ) - 1 ] ++ ;
  }
  final List < Integer > originalCities = new ArrayList < > ( sortedCities ) ;
  Collections . sort ( originalCities ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    writer . write ( Integer . toString ( originalCities . get ( i ) . intValue ( ) ) . zfill ( 6 ) + Integer . toString ( originalCities . get ( i ) . intValue ( ) ) . zfill ( 6 ) + "\n" ) ;
  }
  return id ;
}
