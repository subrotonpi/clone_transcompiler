public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( ( max ( inputs ) - min ( inputs ) ) == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double P = B / ( max ( inputs ) - min ( inputs ) ) ;
    double Q = A - P * sum ( inputs ) / N ;
    System . out . println ( P + " " + Q ) ;
  }
  return N ;
}
