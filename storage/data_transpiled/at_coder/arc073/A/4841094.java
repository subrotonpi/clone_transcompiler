public static int N ( int T ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Ts = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = T ;
  for ( int i = 1 ;
  i < Ts ;
  i ++ ) {
    int middle = Ts - Ts - Ts ;
    if ( middle > T ) ans += T ;
    else ans += middle ;
  }
  System . out . println ( ans ) ;
  return N ;
}
