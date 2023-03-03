public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int ans = 0 ;
  int count = 0 ;
  for ( String string : S . split ( " " ) ) {
    if ( string . equals ( "+" ) ) {
      count ++ ;
    }
    else {
      count -- ;
    }
    if ( count == L ) {
      ans ++ ;
      count = 0 ;
    }
  }
  return ans ;
}
