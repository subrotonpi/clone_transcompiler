public static double L = Double . parseDouble ( input ) {
  double ans , X , Y , S , D = Double . parseDouble ( input ) ;
  if ( D > S ) {
    ans = ( D - S ) / ( X + Y ) ;
    if ( Y > X ) {
      double tmp = ( ( L - D ) + S ) / ( Y - X ) ;
      ans = Math . min ( ans , tmp ) ;
    }
  }
  else {
    ans = ( ( L - S ) + D ) / ( X + Y ) ;
    if ( Y > X ) {
      double tmp = ( S - D ) / ( Y - X ) ;
      ans = Math . min ( ans , tmp ) ;
    }
  }
  return ans ;
}
