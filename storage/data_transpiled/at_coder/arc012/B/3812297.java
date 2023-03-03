static double N = Double . parseDouble ( input ) {
  double VA = Double . parseDouble ( input ) ;
  double VB = Double . parseDouble ( input ) ;
  double L = Double . parseDouble ( input ) ;
  double d = L ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d = VB * ( d / VA ) ;
  }
  return d ;
}
