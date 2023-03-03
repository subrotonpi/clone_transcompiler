public static int n = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int tmp = 0 , cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '(' ) tmp -- ;
    else tmp ++ ;
    cnt = Math . max ( cnt , tmp ) ;
  }
  ans += ")" ;
  return cnt ;
}
