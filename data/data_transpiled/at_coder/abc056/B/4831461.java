public static void print ( int w , int a , int b ) {
  if ( a <= b ) {
    int aw = a + w ;
    int ans = Math . max ( b - aw , 0 ) ;
  }
  else {
    int bw = b + w ;
    int ans = Math . max ( a - bw , 0 ) ;
  }
  System . out . println ( ans ) ;
}
