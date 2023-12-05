public static int N = Integer . parseInt ( input ) {
  List < Integer > A_list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A_list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int a = Arrays . stream ( A_list ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  if ( a % 2 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return a ;
}
