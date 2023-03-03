public static String S = input ( ) {
  String s = S ;
  int zero = s . indexOf ( '0' ) ;
  int one = s . indexOf ( '1' ) ;
  int zeroOneDiff = Math . max ( zero , one ) - Math . min ( zero , one ) ;
  return s . length ( ) - zeroOneDiff ;
}
