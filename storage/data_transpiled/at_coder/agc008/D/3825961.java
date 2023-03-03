public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > Y = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < X . size ( ) ;
  i ++ ) {
    Y . add ( X . get ( i ) - 1 ) ;
  }
  List < Integer > ans = new ArrayList < Integer > ( N * N ) ;
  Stack < Integer > must = new Stack < Integer > ( ) ;
  for ( int i = 0 ;
  i < Y . size ( ) ;
  i ++ ) {
    ans . add ( Y . get ( i ) ) ;
    must . push ( i ) ;
  }
  must . pop ( ) ;
  used . push ( N ) ;
  return ans . toArray ( ) ;
}
