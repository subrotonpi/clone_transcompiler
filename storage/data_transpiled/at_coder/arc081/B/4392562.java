public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String S = input ;
  String T = input ;
  int cnt = 0 ;
  long ans = 0 ;
  String tateyoko = "" ;
  if ( S . charAt ( 0 ) == T . charAt ( 0 ) ) {
    ans += 3 ;
    cnt ++ ;
    tateyoko = "tate" ;
  }
  else {
    ans += 6 ;
    cnt += 2 ;
    tateyoko = "yoko" ;
  }
  while ( cnt < N ) {
    if ( tateyoko . equals ( "tate" ) ) {
      if ( S . charAt ( cnt ) != T . charAt ( cnt ) ) {
        ans *= 2 ;
        cnt += 2 ;
        tateyoko = "yoko" ;
      }
      else {
        ans *= 2 ;
        cnt ++ ;
      }
    }
    else {
      if ( S . charAt ( cnt ) != T . charAt ( cnt ) ) {
        ans *= 3 ;
        cnt += 2 ;
      }
      else {
        cnt ++ ;
        tateyoko = "tate" ;
      }
    }
  }
  System . out . println ( ans % 1000000007 ) ;
}
