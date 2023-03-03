public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> data = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    data . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  String tempLeader = Collections . singletonList ( input . nextLine ( ) ) ;
  int leader = tempLeader . indexOf ( "o" ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    if ( leader != 2 * ( N - 1 ) && data . get ( L - 1 - i ) . charAt ( leader + 1 ) == '-' ) {
      leader -= 2 ;
    }
  }
  return leader ;
}
