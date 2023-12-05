public static double [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] A = new double [ N ] [ N ] ;
  double Ax = 0 , Ay = 0 ;
  double [ ] B = new double [ N ] [ N ] ;
  double Bx = 0 , By = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = new double [ x ] ;
    Ax += x ;
    Ay += y ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    B [ i ] = new double [ y ] ;
    Bx += x ;
    By += y ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    B [ i ] = new double [ y ] ;
    Bx += x ;
    By += y ;
  }
  return A ;
}
