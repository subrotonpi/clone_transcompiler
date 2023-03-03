public static String round ( double x , int d ) {
  double p = 10 * d ;
  return ( x * p * 2 + 1 ) / 2 / p ;
  /* check Dir */
  int nDin = Math . round ( dis / 60 ) ;
  int W ;
  if ( ( nDin >= 0 ) && ( nDin <= 0.2 ) ) {
    W = 0 ;
  }
  else if ( ( nDin >= 0.3 ) && ( nDin <= 1.5 ) ) {
    W = 1 ;
  }
  else if ( ( nDin >= 1.6 ) && ( nDin <= 3.3 ) ) {
    W = 2 ;
  }
  else if ( ( nDin >= 3.4 ) && ( nDin <= 5.4 ) ) {
    W = 3 ;
  }
  else if ( ( nDin >= 5.5 ) && ( nDin <= 7.9 ) ) {
    W = 4 ;
  }
  else if ( ( nDin >= 8.0 ) && ( nDin <= 10.7 ) ) {
    W = 5 ;
  }
  else if ( ( nDin >= 10.8 ) && ( nDin <= 13.8 ) ) {
    W = 6 ;
  }
  else if ( ( nDin >= 13.9 ) && ( nDin <= 17.1 ) ) {
    W = 7 ;
  }
  else if ( ( nDin >= 17.2 ) && ( nDin <= 20.7 ) ) {
    W = 8 ;
  }
  else if ( ( nDin >= 20.8 ) && ( nDin <= 24.4 ) ) {
    W = 9 ;
  }
  else if ( ( nDin >= 24.5 ) && ( nDin <= 28.4 ) ) {
    W = 10 ;
  }
  else if ( ( nDin >= 28.5 ) && ( nDin <= 32.6 ) ) {
    W = 11 ;
  }
  else if ( ( nDin >= 32.7 ) && ( nDin <= 12 ) ) {
    W = 12 ;
  }
  if ( ( nDin >= 3600 * 1 / 32 ) && ( nDin < 3600 * 3 / 32 ) ) {
    Dir = "NNE" ;
  }
  else if ( ( nDin >= 3600 * 3 / 32 ) && ( nDin < 3600 * 5 / 32 ) ) {
    Dir = "NE" ;
  }
  else if ( ( nDin >= 3600 * 5 / 32 ) && ( nDin < 3600 * 7 / 32 ) ) {
    Dir = "ENE" ;
  }
  else if ( ( nD @ @