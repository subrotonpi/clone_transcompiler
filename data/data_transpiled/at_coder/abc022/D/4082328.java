public static double getN ( ) {
  int N = Integer . parseInt ( input ) ;
  double Axl [ ] = new double [ N ] ;
  double Ayl [ ] = new double [ N ] ;
  double Bxl [ ] = new double [ N ] ;
  double Byl [ ] = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Ax = Integer . parseInt ( input . nextLine ( ) ) ;
    int Ay = Integer . parseInt ( input . nextLine ( ) ) ;
    Axl [ i ] = Ax ;
    Ayl [ i ] = Ay ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Bx = Integer . parseInt ( input . nextLine ( ) ) ;
    int By = Integer . parseInt ( input . nextLine ( ) ) ;
    Bxl [ i ] = Bx ;
    Byl [ i ] = By ;
  }
  double gAx = 0 ;
  double gAy = 0 ;
  double gBx = 0 ;
  double gBy = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    gAx += Axl [ i ] / N ;
    gAy += Ayl [ i ] / N ;
    gBx += Bxl [ i ] / N ;
    gBy += Byl [ i ] / N ;
  }
  double lA = 0 ;
  double lB = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lA += ( ( Axl [ i ] - gAx ) * ( 2 ) + ( Ayl [ i ] - gAy ) * ( 2 ) ) * ( 1 / 2 ) ;
    lB += ( ( Bxl [ i ] - gBx ) * ( 2 ) + ( Byl [ i ] - gBy ) * ( 2 ) ) * ( 1 / 2 ) ;
  }
  return lB / lA ;
}
