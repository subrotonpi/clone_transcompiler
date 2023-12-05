public static String [ ] getStrings ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String sIn = input . nextLine ( ) ;
    String reversedsIn = new String ( Collections . reverseOrder ( sIn ) ) ;
    S . add ( reversedsIn ) ;
  }
  Collections . sort ( S ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    String anTemp = S . get ( j ) ;
    String ans = new String ( Collections . reverseOrder ( anTemp ) ) ;
    System . out . println ( ans ) ;
  }
  return S . toArray ( new String [ 0 ] ) ;
}
