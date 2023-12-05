public static int [ ] getN ( ) {
  String S = input ;
  int [ ] ans = new int [ N ] ;
  ans [ 0 ] = 0 ;
  int x = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'I' ) {
      x ++ ;
      ans [ i ] = x ;
    }
    else {
      x -- ;
      ans [ i ] = x ;
    }
  }
  System . out . println ( max ( ans ) ) ;
  return ans ;
}
