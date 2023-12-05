public static int solve ( List < Integer > mList ) {
  int minVal = mList . get ( 0 ) ;
  for ( int m : mList ) {
    minVal = Math . min ( minVal , gcd ( minVal , m ) ) ;
  }
  return minVal ;
}
