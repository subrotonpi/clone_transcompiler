public static void input ( ) {
  n = input . nextLine ( ) ;
  int N = Math . abs ( Integer . parseInt ( n . nextLine ( ) ) - Integer . parseInt ( n . nextLine ( ) ) ) ;
  int cnt = N / 10 ;
  if ( cnt > 7 ) {
    cnt ++ ;
    mod = 10 - mod ;
  }
  int cnt2 = mod , mod2 = 5 ;
  System . out . println ( cnt + cnt2 + mod2 ) ;
}
