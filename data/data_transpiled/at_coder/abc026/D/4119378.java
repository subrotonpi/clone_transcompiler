@ VisibleForTesting static double sin ( double t ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  return A * t + B * sin ( C * t * PI ) ;
}
