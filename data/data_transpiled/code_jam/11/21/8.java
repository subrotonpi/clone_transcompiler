@ GwtIncompatible ( "java.util.Scanner" ) public static double [ ] [ ] testCase ( ) {
  final int N = Integer . parseInt ( readLine ( ) ) ;
  final char [ ] [ ] matrix = new char [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    matrix [ i ] = readLine ( ) ;
  }
  final int [ ] gamess = new int [ N ] ;
  final int [ ] winss = new int [ N ] ;
  final double [ ] wps = new double [ N ] ;
  for ( int i = 0 ;
  i < matrix . length ;
  i ++ ) {
    final char [ ] row = matrix [ i ] ;
    int wins = 0 ;
    int games = 0 ;
    for ( int j = 0 ;
    j < row . length ;
    j ++ ) {
      if ( row [ j ] != '.' ) {
        games ++ ;
        if ( row [ j ] == '1' ) wins ++ ;
      }
    }
    gamess [ i ] = games ;
    winss [ i ] = wins ;
    wps [ i ] = wins / games ;
  }
  final double [ ] owps = new double [ N ] ;
  for ( int i = 0 ;
  i < matrix . length ;
  i ++ ) {
    final char [ ] row = matrix [ i ] ;
    int wptot = 0 ;
    for ( int j = 0 ;
    j < row . length ;
    j ++ ) {
      if ( row [ j ] != '.' ) {
        wptot += ( winss [ j ] - ( row [ j ] == '1' ? 0 : 1 ) ) / ( gamess [ j ] - 1 ) ;
      }
    }
    owps [ i ] = wptot / gamess [ i ] ;
  }
  final double [ ] [ ] rpis = new double [ N ] [ ] ;
  for ( int i = 0 ;
  i < rpis . length ;
  i ++ ) {
    final char [ ] row = matrix [ i ] ;
    int owptot = 0 ;
    for ( int j = 0 ;
    j < row . length ;
    j ++ ) {
      if ( row [ j ] != '.' ) owptot += owps [ j ] ;
    }
    final double oowp = owptot / gamess [ i ] ;
    rpis [ i ] = 0.25 * wps [ i ] + 0.5 * owps [ i ] + 0.25 * oowp ;
  }
  return rpis ;
}
