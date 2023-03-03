public static double solve ( int A , int B ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> jrms = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    jrms . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  }
  return solve ( A , B ) ;
  double res = 0 ;
  for ( List < Integer > jrm : jrms ) {
    int X = jrm . get ( 0 ) ;
    int R = jrm . get ( 1 ) ;
    int H = jrm . get ( 2 ) ;
    double temp ;
    if ( A <= X && X + H <= B ) {
      temp = Math . PI * ( R * R ) * H / 3 ;
    }
    else if ( X <= A && A <= X + H && B <= X + H ) {
      temp = Math . PI * ( ( R * ( X + H - A ) / H ) * ( X + H - A ) / 3 ) ;
    }
    else if ( A <= X && B <= X + H ) {
      temp = Math . PI * ( R * R ) * H / 3 ;
      temp -= Math . PI * ( ( R * ( X + H - B ) / H ) * ( X + H - B ) / 3 ) ;
    }
    else if ( X <= A && B <= X + H ) {
      temp = Math . PI * ( R * ( X + H - A ) / H ) * ( X + H - A ) / 3 ;
      temp -= Math . PI * ( ( R * ( X + H - B ) / H ) * ( X + H - B ) / 3 ) ;
    }
    else {
      temp = 0 ;
    }
    res += temp ;
  }
  return res ;
}
