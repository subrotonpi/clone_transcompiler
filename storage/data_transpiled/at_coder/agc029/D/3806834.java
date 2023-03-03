public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Map < Integer , List < Integer >> dic = new HashMap < > ( ) ;
  for ( List < Integer > l : L ) {
    try {
      dic . get ( l . get ( 0 ) ) . add ( l . get ( 1 ) ) ;
    }
    catch ( Exception e ) {
      e . printStackTrace ( ) ;
    }
  }
  return H ;
}
