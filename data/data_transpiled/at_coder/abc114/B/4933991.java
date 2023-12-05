public static int getInt ( ) {
  String s = input ( ) ;
  int bestdif = 1000 ;
  for ( int i = 0 ;
  i < s . length ( ) - 2 ;
  i ++ ) {
    if ( bestdif > Math . abs ( 753 - Integer . parseInt ( s . substring ( i , i + 3 ) ) ) ) {
      bestdif = Math . abs ( 753 - Integer . parseInt ( s . substring ( i , i + 3 ) ) ) ;
    }
  }
  return bestdif ;
}
