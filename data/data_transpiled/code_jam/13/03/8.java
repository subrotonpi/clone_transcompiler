@ VisibleForTesting static boolean isFairSqrt ( String s ) {
  String s2 = String . valueOf ( Integer . parseInt ( s ) * 2 ) ;
  return s . equals ( s . substring ( 0 , s . length ( ) - 1 ) ) && s2 . equals ( s2 . substring ( 0 , s2 . length ( ) - 1 ) ) ;
}
