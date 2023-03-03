public static String print ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > W = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W . add ( input . nextLine ( ) ) ;
  }
  boolean flag = true ;
  return flag ? "Yes" : "No" ;
}
