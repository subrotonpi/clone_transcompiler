public static void N_A , N_B = map ( Integer . parseInt , input ) {
  Set < Integer > A = new HashSet < Integer > ( ) ;
  Set < Integer > B = new HashSet < Integer > ( ) ;
  for ( Integer i : input ) {
    A . add ( i ) ;
    B . add ( i ) ;
  }
  System . out . println ( A . size ( ) & B . size ( ) / A . size ( ) | B . size ( ) ) ;
}
