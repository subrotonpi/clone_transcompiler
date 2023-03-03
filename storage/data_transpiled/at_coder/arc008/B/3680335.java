@ InputFunction public static int bUnle ( int N , int M , String Name , String Kit ) {
  LinkedHashMap < Character , Integer > nameUseChar = new LinkedHashMap < Character , Integer > ( ) ;
  for ( char c : Name . toCharArray ( ) ) nameUseChar . put ( c , 1 ) ;
  LinkedHashMap < Character , Integer > kitChars = new LinkedHashMap < Character , Integer > ( ) ;
  for ( char c : Kit . toCharArray ( ) ) kitChars . put ( c , 1 ) ;
  int ans = 0 ;
  for ( Character key : nameUseChar . keySet ( ) ) {
    if ( kitChars . get ( key ) == 0 ) {
      ans = - 1 ;
      break ;
    }
    ans = Math . max ( ans , ( nameUseChar . get ( key ) + kitChars . get ( key ) - 1 ) / kitChars . get ( key ) ) ;
  }
  return ans ;
}
