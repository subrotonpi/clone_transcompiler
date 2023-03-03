public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int sakaime = 0 ;
  sakaime < N ;
  sakaime ++ ) {
    Set left = new HashSet ( S . substring ( 0 , sakaime ) ) ;
    Set right = new HashSet ( S . substring ( sakaime ) ) ;
    int cnt = left . size ( ) ;
    ans = Math . max ( ans , cnt ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
