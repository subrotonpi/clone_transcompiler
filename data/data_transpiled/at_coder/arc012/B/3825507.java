static long N ( int N , double va , double vb , double L ) {
  long takahashi = 0 ;
  long kame = L ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double time = L / va ;
    takahashi += L ;
    kame += vb * time ;
    L = kame - takahashi ;
  }
  System . out . println ( L ) ;
  return 0 ;
}
