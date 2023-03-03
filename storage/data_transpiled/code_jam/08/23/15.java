static private List < Pair < Integer , Integer >> readData ( ) {
  /* rl */
  String [ ] nextLine = System . in . readLine ( ) . split ( "\\s+" ) ;
  int n = Integer . parseInt ( nextLine [ 0 ] ) ;
  List < Pair < Integer , Integer >> cases = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int K = Integer . parseInt ( nextLine [ 0 ] ) ;
    int [ ] il = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) il [ j ] = Integer . parseInt ( nextLine [ j ] ) ;
    Pair < Integer , Integer > case = new Pair < > ( K , il [ 1 ] , il [ 0 ] + 1 ) ;
    cases . add ( case ) ;
  }
  return cases ;
}
