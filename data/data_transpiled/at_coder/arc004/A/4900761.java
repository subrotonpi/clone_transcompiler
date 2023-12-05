public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> point = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) point . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  double distance = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) distance = Math . max ( distance , ( ( point . get ( i ) . get ( 0 ) - point . get ( j ) . get ( 0 ) ) * 2 + ( point . get ( i ) . get ( 1 ) - point . get ( j ) . get ( 1 ) ) * 2 ) * 0.5 ) ;
  }
  System . out . println ( distance ) ;
}
