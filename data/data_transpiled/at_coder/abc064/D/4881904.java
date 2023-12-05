public static int n ( ) {
  String s = input . nextLine ( ) ;
  int ltmp = 0 ;
  int ladd = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == ')' ) {
      if ( ltmp == 0 ) ladd ++ ;
      else ltmp -- ;
    }
    else ltmp ++ ;
  }
  return ladd ;
}
