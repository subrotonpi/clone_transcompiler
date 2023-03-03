public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i : input ( ) . split ( " " ) ) {
    L . add ( Integer . parseInt ( i ) ) ;
  }
  L . sort ( ) ;
  L = L . subList ( 0 , 2 ) ;
  return L . size ( ) ;
}
