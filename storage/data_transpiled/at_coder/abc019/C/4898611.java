public static Set < Integer > solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B . add ( A . get ( i ) ) ;
  }
  return B ;
}
