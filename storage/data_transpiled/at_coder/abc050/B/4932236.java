public static int N = Integer . parseInt ( input ) {
  List < Integer > Tn = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Tn . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> PX = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) PX . add ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) PX . add ( Lists . newArrayList ( ) ) ;
  double t = sum ( Tn ) ;
  for ( int p = 0 ;
  p < PX . size ( ) ;
  p ++ ) {
    System . out . println ( t - ( Tn . get ( p - 1 ) - PX . get ( p ) ) ) ;
  }
  return t ;
}
