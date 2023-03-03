@ Nullable public static int ceil ( @ NotNull final int N , @ NotNull final int M ) {
  final String name = input . nextLine ( ) ;
  final String kit = input . nextLine ( ) ;
  final HashMap < Character , Integer > unit = new HashMap < > ( ) ;
  for ( char c : kit . toCharArray ( ) ) {
    if ( unit . containsKey ( c ) ) {
      unit . put ( c , 1 ) ;
    }
    else {
      unit . put ( c , 1 ) ;
    }
  }
  final HashMap < Character , Integer > need = new HashMap < > ( ) ;
  for ( char c : name . toCharArray ( ) ) {
    if ( need . containsKey ( c ) ) {
      need . put ( c , 1 ) ;
    }
    else {
      need . put ( c , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( Map . Entry < Character , Integer > e : need . entrySet ( ) ) {
    if ( ! unit . containsKey ( e . getKey ( ) ) ) {
      ans = - 1 ;
      break ;
    }
    ans = Math . max ( ans , ceil ( e . getValue ( ) / unit . get ( e . getKey ( ) ) ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
