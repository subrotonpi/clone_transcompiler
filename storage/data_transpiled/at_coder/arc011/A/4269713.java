public static void print ( String s ) {
  s = input . split ( " " ) ;
  int m = Integer . parseInt ( s [ 0 ] ) ;
  int n = Integer . parseInt ( s [ 1 ] ) ;
  int su = Integer . parseInt ( s [ 2 ] ) ;
  int ans = su ;
  while ( su >= m ) {
    su = su + n - m ;
    ans += n ;
  }
  System . out . println ( ans ) ;
}
