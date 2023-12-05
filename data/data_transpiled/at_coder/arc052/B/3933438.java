static final double [ ] J ( int N ) {
  return map ( N , input -> {
    double M = P . maximum ;
    double N = input . nextDouble ( ) ;
    double Q = input . nextDouble ( ) ;
    double X = J ( N ) ;
    double R = P . maximum ;
    double H = input . nextDouble ( ) ;
    double A = J ( Q ) ;
    double B = J ( Q ) ;
    double K = M ( X + H - M ( X , A . clone ( ) ) , 0 ) ;
    double L = M ( X + H - M ( X , B ) ) ;
    return L ;
  }
  ) ;
}
