static final String print ( ) {
  String l1 = "" , l2 = "" ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) l1 += System . in . readLine ( ) . trim ( ) ;
  inputList = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < l2 ;
  i ++ ) inputList . add ( Integer . parseInt ( l2 ) ) ;
  Collections . sort ( inputList , Collections . reverseOrder ( ) ) ;
  int odIndex = inputList . size ( ) ;
  return odIndex ;
}
