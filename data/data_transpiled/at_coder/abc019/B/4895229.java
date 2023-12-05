public static void solve ( ) {
  String s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  String ans = "" ;
  int ct = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( ans . equals ( "" ) ) {
      ans += s . charAt ( i ) ;
      ct = 1 ;
    }
    else if ( ans . charAt ( i ) != s . charAt ( i ) ) {
      ans += ct ;
      ans += s . charAt ( i ) ;
      ct = 1 ;
    }
  }
  ans += ct ;
  System . out . println ( ans ) ;
}
