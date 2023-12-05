public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( L , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  List < Integer > R = new ArrayList < > ( ) ;
  R . add ( new Integer ( L . get ( 0 ) . intValue ( ) ) ) ;
  for ( int s = 1 ;
  s < L . size ( ) ;
  s ++ ) {
    R . add ( new Integer ( s ) ) ;
  }
  return R . size ( ) ;
}
