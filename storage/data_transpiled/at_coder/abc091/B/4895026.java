public static int max ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  Map < String , Integer > cnt = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    try {
      cnt . put ( s , 1 ) ;
    }
    catch ( Exception e ) {
      cnt . put ( s , - 1 ) ;
    }
  }
  for ( int i : cnt . values ( ) ) {
    ans = Math . max ( ans , i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
