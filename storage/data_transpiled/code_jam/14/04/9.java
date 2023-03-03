static final double [ ] [ ] getDoubleArrays ( ) {
  final int N = naomi . length ;
  final boolean [ ] [ ] kenFree = new boolean [ N ] [ N ] ;
  int score = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int chosenNaomi = naomi [ i ] ;
    final int chosenNaomi = ken [ chosenNaomi ] ;
    final int j = kenFree [ j ] ;
    if ( chosenNaomi > chosenNaomi ) score ++ ;
  }
  final int edge = Math . max ( noHopers , def_losses ) ;
  final int [ ] naomi = new int [ N - edge ] ;
  final int [ ] ken = new int [ N - edge ] ;
  for ( int i = 0 ;
  i < N - edge ;
  i ++ ) {
    if ( naomi [ i ] > ken [ i ] ) score ++ ;
    naomi [ i ] = ken [ i ] ;
  }
  final int [ ] result = new int [ N ] ;
  final int noHopers = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( naomi [ i ] > ken [ i ] ) score ++ ;
    result [ i ] = new int [ n ] ;
  }
  final BufferedReader in = new BufferedReader ( new FileReader ( "" + args [ 1 ] + "" ) ) ;
  final BufferedReader out = new BufferedReader ( new FileReader ( "" + args [ 1 ] + ".out" ) ) ;
  final int cases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    final int testCase = in . read ( ) ;
    final int output = solveCase ( testCase ) ;
    out . write ( String . format ( "Case #%i: %s\n" , i + 1 , output ) ) ;
    out . write ( String . format ( "Case #%i: %s\n" , i + 1 , output ) ) ;
  }
  final int [ ] line = in . read ( ) . split ( "\n" ) ;
  out . close ( ) ;
  in . close ( ) ;
  out . close ( ) ;
  return result ;
}
