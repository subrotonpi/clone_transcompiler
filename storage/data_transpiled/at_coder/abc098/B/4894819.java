public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    String s1 = s . substring ( 0 , i ) ;
    String s2 = s . substring ( i ) ;
    int cnt = 0 ;
    for ( char x : "abcdefghijklmnopqrstuvwxyz" . toCharArray ( ) ) {
      if ( s1 . contains ( x ) && s2 . contains ( x ) ) {
        cnt ++ ;
      }
    }
    ans = Math . max ( ans , cnt ) ;
  }
  System . out . println ( ans ) ;
}
