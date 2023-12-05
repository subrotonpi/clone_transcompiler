public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int ans = 0 ;
  int count = 0 ;
  for ( String string : S . split ( " " ) ) {
    count += string . equals ( "+" ) ? 1 : - 1 ;
    if ( count == L ) {
      ans ++ ;
      count = 0 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
