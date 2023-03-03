public static String print ( String a , String b , String c , int K ) {
  String res = "Unfair" ;
  if ( K % 2 == 0 ) {
    if ( Math . abs ( a - b ) <= 10 * * 18 ) res = a - b ;
  }
  else {
    if ( Math . abs ( a - b ) <= 10 * * 18 ) res = b - a ;
  }
  return res ;
}
