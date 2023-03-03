static int ntests ( int L , int P , int C ) throws IOException {
  final double ratio = P * 1.0 / L ;
  if ( ratio <= C ) return 0 ;
  if ( L == 1 && P == 3 ) return 1 ;
  final int testpoint = ( int ) ( L * ( ratio * 0.5 ) ) ;
  final int count = Math . max ( 1 + ntests ( L , testpoint , C ) , 1 + ntests ( testpoint , P , C ) ) ;
  if ( ( testpoint * testpoint == L * P ) || ( testpoint + 1 == P ) ) return count ;
  final int count2 = Math . max ( 1 + ntests ( L , testpoint + 1 , C ) , 1 + ntests ( testpoint + 1 , P , C ) ) ;
  return Math . min ( count , count2 ) ;
}
