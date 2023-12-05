@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int MOD = 10 * * 9 + 7 ;
  Counter < Integer > ctr = new Counter < Integer > ( S ) ;
  int ans = 1 ;
  for ( Integer v : ctr . values ( ) ) {
    ans *= ( v + 1 ) ;
  }
  ans -- ;
  System . out . println ( ans % MOD ) ;
}
