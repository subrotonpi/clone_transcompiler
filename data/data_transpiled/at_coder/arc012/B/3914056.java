static void N ( int N , double va , double vb , double L ) {
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double t = L / va ;
    L -= ( va - vb ) * t ;
  }
  System . out . println ( L ) ;
}
