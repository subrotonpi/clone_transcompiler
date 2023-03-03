public static void solve ( ) {
  String s = input . nextLine ( ) ;
  String n = input . nextLine ( ) ;
  int n = Integer . parseInt ( n ) ;
  int cnt = 0 ;
  int last = 0 ;
  boolean has = false ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char x = s . charAt ( i ) ;
    if ( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ) {
      cnt = 0 ;
    }
    else {
      cnt ++ ;
    }
    if ( cnt >= n ) {
      has = true ;
      last = i - n + 1 ;
      ans += last + 1 ;
    }
    else if ( has ) {
      ans += last + 1 ;
    }
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      System . out . print ( "Case #" + t + ":" ) ;
      solve ( ) ;
    }
  }
}
