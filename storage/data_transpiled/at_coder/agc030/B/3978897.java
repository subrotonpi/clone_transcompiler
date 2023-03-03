@ VisibleForTesting static int burn ( int L , List < Integer > lX ) {
  lX . add ( L ) ;
  lX . add ( 0 , 0 ) ;
  List < Integer > rX = Lists . newArrayList ( L - i ) ;
  for ( int i = lX . size ( ) - 1 ;
  i >= 0 ;
  i -- ) rX . add ( L - i ) ;
  return Math . max ( burnIn ( L , lX , rX ) , burnIn ( L , rX , lX ) ) ;
}
