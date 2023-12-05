public static int I ( int O , int T , int J , int L , int S , int Z ) {
  int res = O ;
  res += Integer . numberOfTrailingZeros ( T ) ;
  res += 3 * Math . min ( Integer . numberOfTrailingZeros ( S ) , 3 ) ;
  int res2 = O ;
  if ( I > 0 && J > 0 && L > 0 ) {
    res2 += 3 ;
    I = Integer . numberOfTrailingZeros ( T ) ;
  }
  res2 += Integer . numberOfTrailingZeros ( T ) ;
  System . out . println ( max ( res , res2 ) ) ;
  return res2 ;
}
