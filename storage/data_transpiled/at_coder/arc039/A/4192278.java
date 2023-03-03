public static long aProblem ( int A , int B ) {
  long ans = - Long . MAX_VALUE ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    String aStr = Integer . toString ( A ) ;
    long aMod = Long . parseLong ( aStr . substring ( 0 , i ) + "9" + aStr . substring ( i + 1 ) ) ;
    ans = Math . max ( ans , aMod - B ) ;
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    String bStr = Integer . toString ( B ) ;
    long bMod = Long . parseLong ( bStr . substring ( 0 , i ) + ( i == 0 ? "1" : "0" ) + bStr . substring ( i + 1 ) ) ;
    ans = Math . max ( ans , A - bMod ) ;
  }
  return ans ;
}
