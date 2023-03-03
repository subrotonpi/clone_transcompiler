static final public void input ( ) {
  int tX = Integer . parseInt ( input . nextLine ( ) ) ;
  int tY = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> poly = new ArrayList < > ( ) ;
  for ( String e : System . console ( ) . readLine ( ) . split ( " " ) ) {
    poly . add ( Collections . singletonList ( Integer . parseInt ( e ) ) ) ;
  }
  int ans = 10000 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > p1 = poly . get ( i - 1 ) ;
    List < Integer > p2 = poly . get ( i ) ;
    Complex p = new Complex ( p2 . get ( 0 ) - p1 . get ( 0 ) , p2 . get ( 1 ) - p1 . get ( 1 ) ) ;
    Complex t = new Complex ( tX - p1 . get ( 0 ) , tY - p1 . get ( 1 ) ) ;
    t . mul ( p . conjugate ( ) / Math . abs ( p ) ) ;
    int dist = Math . abs ( t . imag ( ) ) ;
    if ( dist < ans ) {
      ans = dist ;
    }
  }
  System . out . println ( ans ) ;
}
