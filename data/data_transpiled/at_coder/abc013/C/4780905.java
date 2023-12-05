public static double print ( double n ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  double b = Double . parseDouble ( input . nextLine ( ) ) ;
  double c = Double . parseDouble ( input . nextLine ( ) ) ;
  double d = Double . parseDouble ( input . nextLine ( ) ) ;
  double e = Double . parseDouble ( input . nextLine ( ) ) ;
  double k = Double . NaN ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    double s = Math . max ( 0 , ( e * n - ( b + e ) * i - h ) / ( d + e ) + 1 ) ;
    if ( s + i <= n ) {
      k = Math . min ( a * i + c * s , k ) ;
    }
  }
  return k ;
}
