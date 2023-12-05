static void N ( int N , float Va , float Vb , float L ) {
  N = Integer . parseInt ( input ( ) ) ;
  float K = Vb / Va ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    L *= K ;
  }
  System . out . println ( String . format ( "%.7f" , L ) ) ;
}
