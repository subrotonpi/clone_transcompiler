@ GwtIncompatible ( "java.util.Scanner" ) public static String [ ] [ ] readInput ( ) {
  final boolean DEBUG = false ;
  final String [ ] [ ] result = new String [ 2 ] [ 2 ] ;
  {
    if ( DEBUG ) {
      System . out . println ( "" ) ;
    }
  }
  {
    if ( S == 1 && R == 0 && P == 0 ) {
      return result [ 0 ] ;
    }
    if ( S == 0 && R == 1 && P == 0 ) {
      return result [ 0 ] ;
    }
    if ( S == 0 && R == 0 && P == 1 ) {
      return result [ 1 ] ;
    }
    int N = S + R + P ;
    if ( S > N / 2 || R > N / 2 || P > N / 2 ) {
      return result ;
    }
    int S_1 = 0 ;
    int R_1 = 0 ;
    int P_1 = 0 ;
    if ( S <= R && S <= P ) {
      if ( P > R ) {
        S_1 = P - R ;
        S -- ;
        P -- ;
      }
      else {
        R_1 = R - P ;
        S -- ;
        R -- ;
      }
      S_1 += S / 2 ;
      R_1 += S / 2 ;
      P_1 = N / 2 - S_1 - R_1 ;
      debugPrint ( "1:" , R_1 , P_1 , S_1 ) ;
    }
    else if ( R <= S && R <= P ) {
      if ( S > P ) {
        S_1 = S - P ;
        S -- ;
        R -- ;
      }
      else {
        P_1 = P - S ;
        P -- ;
        R -- ;
      }
      S_1 += R / 2 ;
      P_1 += R / 2 ;
      S_1 += R / 2 ;
      R_1 += P / 2 ;
      S_1 += R / 2 ;
      R_1 += R / 2 ;
    }
    else {
      if ( R > S ) {
        S_1 = R - S ;
        S -- ;
        R -- ;
      }
      else {
        S_1 = S - R ;
        S -- ;
        R -- ;
      }
      S_1 += P / 2 ;
      R_1 += R / 2 ;
      S_1 += R / 2 ;
      R_1 += R / 2 ;
    }
  }
  {
    if ( DEBUG ) {
      System . out . println ( "" ) ;
    }
  }
}
