@ GwtIncompatible ( "java.io.BufferedReader" ) public static double [ ] [ ] readLines ( String [ ] lines ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( "D_Rnd2.in" ) ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "D_Rnd2.out" ) ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) . substring ( 0 , lines . length - 1 ) ) ;
  double [ ] [ ] arr = new double [ cases ] [ cases ] ;
  double [ ] [ ] ret = new double [ cases ] [ ] ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    ret [ i ] = min ( r1 [ i ] , r2 [ i ] ) ;
    out . println ( String . format ( "%.8f" , ret [ i ] ) + "\n" ) ;
  }
  return ret ;
}
