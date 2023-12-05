public static void print ( List < Integer > XY ) {
  int X = XY . get ( 0 ) ;
  int Y = XY . get ( 1 ) ;
  int N1 = ( int ) ( 2 * X / Y - 1 ) ;
  int N2 = ( int ) ( 2 * X / Y + 0 ) ;
  int N3 = ( int ) ( 2 * X / Y + 1 ) ;
  int M1 = N1 * ( ( N1 + 1 ) * Y - 2 * X ) / ( 2 * Y ) ;
  int M2 = N2 * ( ( N2 + 1 ) * Y - 2 * X ) / ( 2 * Y ) ;
  int M3 = N3 * ( ( N3 + 1 ) * Y - 2 * X ) / ( 2 * Y ) ;
  /* judge */
  if ( N <= 0 ) {
    return ;
  }
  if ( M <= 0 || M > N ) {
    return ;
  }
  /* judge */
  if ( N > N2 ) {
    N1 = N2 ;
    N2 = N1 ;
  }
  if ( N > N3 ) {
    N1 = N3 ;
    N3 = N1 ;
  }
  boolean flag = false ;
  if ( judge ( N1 , M1 , X , Y ) ) {
    System . out . println ( N1 + " " + M1 ) ;
    flag = true ;
  }
  if ( N1 != N2 && judge ( N2 , M2 , X , Y ) ) {
    System . out . println ( N2 + " " + M2 ) ;
    flag = true ;
  }
  if ( N2 != N3 && judge ( N3 , M3 , X , Y ) ) {
    System . out . println ( N3 + " " + M3 ) ;
    flag = true ;
  }
  if ( flag == false ) {
    System . out . println ( "Impossible" ) ;
  }
}
