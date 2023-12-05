public static int solve ( List < Integer > mList ) {
  int mVal = mList . get ( 0 ) ;
  for ( int i : mList ) {
    mVal = Math . min ( mVal , gcd ( mVal , i ) ) ;
  }
  return mVal ;
}
