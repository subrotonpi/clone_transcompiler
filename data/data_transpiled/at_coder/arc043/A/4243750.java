public static int aTransformation ( int N , int A , int B , int [ ] S ) {
  float e = sum ( S ) / N ;
  float d = max ( S ) - min ( S ) ;
  if ( d == 0 ) {
    return - 1 ;
  }
  float p = B / d ;
  float q = A - ( e * B ) / d ;
  String ans = p + " " + q ;
  return ans ;
}
