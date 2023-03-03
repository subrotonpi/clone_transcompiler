public static int T = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( T < T ) {
    T = T ;
  }
  if ( T == T ) {
    return false ;
  }
  if ( T >= 2 * T ) {
    return true ;
  }
  return ! win ( T , T - T ) ;
}
for ( int C = 1 ;
C <= T ;
C ++ ) {
  int A1 , A2 , B1 , B2 ;
  A1 = input . nextInt ( ) ;
  A2 = input . nextInt ( ) ;
  B1 = input . nextInt ( ) ;
  B2 = input . nextInt ( ) ;
  int cnt = 0 ;
  for ( int A = A1 ;
  A <= A2 ;
  A ++ ) {
    for ( int B = B1 ;
    B <= B2 ;
    B ++ ) {
      if ( win ( A , B ) ) {
        cnt ++ ;
      }
    }
  }
  System . out . println ( "Case #" + C + ": " + cnt ) ;
}
