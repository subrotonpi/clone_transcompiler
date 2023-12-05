@ GwtIncompatible ( "java.util.Scanner" ) private static int solve ( int L , int P , int C ) {
  int n = 0 ;
  while ( L < P ) {
    L *= C ;
    n ++ ;
  }
  return ( int ) ceil ( log ( n , 2 ) ) ;
}
