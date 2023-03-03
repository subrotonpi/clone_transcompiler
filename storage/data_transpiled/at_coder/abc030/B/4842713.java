public static void print ( int n , int m ) {
  n %= 12 ;
  n += m / 60 ;
  int nTheta = n / 12 * 360 ;
  int mTheta = m / 60 * 360 ;
  int theta = Math . max ( nTheta , mTheta ) - Math . min ( nTheta , mTheta ) ;
  System . out . println ( Math . min ( theta , 360 - theta ) ) ;
}
