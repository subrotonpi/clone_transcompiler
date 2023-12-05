public static int [ ] getNums ( int [ ] As ) {
  int [ ] nums = new int [ N ] ;
  Stack < Tuple > stack = new Stack < Tuple > ( ) ;
  stack . push ( new Tuple ( - 1 , 0 ) ) ;
  for ( int iA = 0 ;
  iA < As . length ;
  iA ++ ) {
    int A = As [ iA ] ;
    while ( stack . peek ( ) . next ( ) > A ) -- ;
  }
  return nums ;
}
