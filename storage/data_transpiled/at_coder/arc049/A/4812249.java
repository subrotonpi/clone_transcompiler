public static String input ( ) {
  String S = input ( ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < L . size ( ) ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  String T = "" ;
  if ( L . get ( 0 ) == 0 ) {
    T += "\" ";}for(inti=0;i<S.length();i++){T+=S.charAt(i)+" \ "" ;
  }
  System . out . println ( T ) ;
  return T ;
}
