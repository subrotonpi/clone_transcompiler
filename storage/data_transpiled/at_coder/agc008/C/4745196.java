public static int a , int square , int qqq , int b , int c , int qqqq , int qqqq ) {
  int a_ = a % 2 ;
  int b_ = b % 2 ;
  int c_ = c % 2 ;
  int bSub = b - b_ ;
  int cSub = c - c_ ;
  if ( b_ == 1 && c_ == 1 && a > 0 ) {
    a = a - 1 ;
    a_ = a % 2 ;
    int aSub = a - a_ ;
    System . out . println ( aSub + bSub + cSub + 3 + square ) ;
  }
  else if ( a_ == 1 && c_ == 1 && b > 0 ) {
    int aSub = a - a_ ;
    b = b - 1 ;
    b_ = b % 2 ;
    bSub = b - b_ ;
    System . out . println ( aSub + bSub + cSub + 3 + square ) ;
  }
  else if ( a_ == 1 && b_ == 1 && c > 0 ) {
    int aSub = a - a_ ;
    c = c - 1 ;
    c_ = c % 2 ;
    cSub = c - c_ ;
    System . out . println ( aSub + bSub + cSub + 3 + square ) ;
  }
  else {
    a_ = a % 2 ;
    int aSub = a - a_ ;
    System . out . println ( aSub + bSub + cSub + square ) ;
  }
  return qqqq ;
}
