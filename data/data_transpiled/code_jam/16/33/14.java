static int solve ( int J , int P , int S , int K , int Case ) {
  int [ ] Js = new int [ J ] ;
  int [ ] Ps = new int [ P ] ;
  int [ ] Ss = new int [ S ] ;
  LpProblem prob = new LpProblem ( "Sudoku Problem" , LpMaximize . class ) ;
  LpVariable [ ] [ ] x = LpVariable . maps ( "x" , ( Js [ 0 ] , Ps [ 0 ] , Ss [ 0 ] ) , 0 , 1 , LpInteger . class ) ;
  for ( int j = 0 ;
  j < Js . length ;
  j ++ ) {
    for ( int p = 0 ;
    p < Ps . length ;
    p ++ ) {
      prob . add ( new LpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpL @ @