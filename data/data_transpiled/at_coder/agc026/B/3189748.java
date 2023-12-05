@ VisibleForTesting static boolean solve ( int A , int B , int C , int D ) {
  if ( A < B || D < B ) return false ;
  if ( A % B > C ) return false ;
  if ( D % B == 0 ) return true ;
  int g = gcd ( B , D ) ;
  int r = A % g ;
  return ! ( C < B - g + r ) ;
}
