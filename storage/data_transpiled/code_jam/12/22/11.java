@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicReference" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  PrintWriter outf = new PrintWriter ( "B-large.out" ) ;
  int numTests = Integer . parseInt ( inf . readLine ( ) . replaceAll ( " " , "" ) ) ;
  /* We can move the first test in the first test */
  int test = 0 ;
  int N = Integer . parseInt ( inf . readLine ( ) ) ;
  int M = Integer . parseInt ( inf . readLine ( ) ) ;
  int [ ] [ ] C = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] [ i ] = Integer . parseInt ( inf . readLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    F [ i ] [ i ] = Integer . parseInt ( inf . readLine ( ) ) ;
  }
  System . out . printf ( "Case #%d: %.2f%n" , test + 1 , getMinTime ( ) / 10.0 ) ;
  outf . close ( ) ;
  /* Move the second test in the first test */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int di = - 1 ;
    for ( int j = - 1 ;
    j < N ;
    j ++ ) {
      if ( Math . abs ( di ) != Math . abs ( dj ) ) {
        /* Move the first test in the second test */
        best [ i ] [ j ] = - 1 ;
      }
    }
  }
  /* Move the first test in the second test in the first test */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int j = - 1 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( canMove ( i , j , di , dj , 0 ) && best [ di ] [ j ] == - 1 ) {
        /* Move the second test in the second test */
        if ( i == j ) continue ;
        /* Move the second test in the second */
        