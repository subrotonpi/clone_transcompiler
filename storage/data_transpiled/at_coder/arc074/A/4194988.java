public static double getDistance ( int H , int W ) {
  double ans = Double . MIN_VALUE ;
  for ( int i = 1 ;
  i < H ;
  i ++ ) {
    int a = ( i ) ;
    int b = ( i ) ;
    double S = W * ( H - i ) ;
    if ( a % 2 == 0 || b % 2 == 0 ) {
      ans = Math . min ( ans , Math . abs ( S - a * b / 2 ) ) ;
    }
    else {
      if ( a == 1 && b == 1 ) {
        continue ;
      }
      else {
        double Sbig = ( Math . max ( a , b ) + 1 ) * Math . min ( a , b ) / 2 ;
        double Ssma = ( Math . max ( a , b ) - 1 ) * Math . min ( a , b ) / 2 ;
        double Sdiff = Math . max ( Math . abs ( S - Sbig ) , Math . abs ( S - Ssma ) , Math . abs ( Sbig - Ssma ) ) ;
        ans = Math . min ( ans , Sdiff ) ;
      }
    }
  }
  H = ( W ) ;
  for ( int i = 1 ;
  i < H ;
  i ++ ) {
    int a = ( i ) ;
    int b = ( i ) ;
    double S = W * ( H - i ) ;
    if ( a % 2 == 0 || b % 2 == 0 ) {
      ans = Math . min ( ans , Math . abs ( S - a * b / 2 ) ) ;
    }
    else {
      if ( a == 1 && b == 1 ) {
        continue ;
      }
      else {
        double Sbig = ( Math . max ( a , b ) + 1 ) * Math . min ( a , b ) / 2 ;
        double Ssma = ( Math . max ( a , b ) - 1 ) * Math . min ( a , b ) / 2 ;
        double Sdiff = Math . max ( Math . abs ( S - Sbig ) , Math . abs ( S - Ssma ) , Math . abs ( Sbig - Ssma ) ) ;
        ans = Math . min ( ans , Sdiff ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
