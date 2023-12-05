public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  List < Integer > C = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( B ) ;
  Collections . sort ( C ) ;
  List < Integer > S = new ArrayList < > ( ) ;
  S . add ( 0 ) ;
  int s = 0 ;
  int i = 0 ;
  for ( int b : B ) {
    while ( i < N ) {
      if ( b <= A . get ( i ) ) {
        break ;
      }
      i ++ ;
    }
    s += i ;
    S . add ( s ) ;
  }
  int t = 0 ;
  i = 0 ;
  for ( int c : C ) {
    while ( i < N ) {
      if ( c <= B . get ( i ) ) {
        break ;
      }
      i ++ ;
    }
    t += S . get ( i ) ;
  }
  System . out . println ( t ) ;
}
