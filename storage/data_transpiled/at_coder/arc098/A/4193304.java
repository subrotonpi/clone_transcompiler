public static int n ( ) {
  String s = input ( ) ;
  int ans = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'W' : count ++ ;
      break ;
      case 'W' : count -- ;
      ans ++ ;
      break ;
      default : break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
