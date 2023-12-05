public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  while ( s . contains ( "bcabcab" ) ) {
    s = s . replace ( "bcabcab" , "b" , 1 ) ;
    ans += 3 ;
  }
  switch ( s ) {
    case "b" : break ;
    case "abc" : ans ++ ;
    case "cabca" : ans += 2 ;
    break ;
    default : System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  return ans ;
}
