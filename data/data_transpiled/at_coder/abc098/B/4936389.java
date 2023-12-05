public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  final String abcs = "abcdefghijklmnopqrstuvwxyz" ;
  int ans = 0 ;
  for ( int sakaime = 0 ;
  sakaime < N ;
  sakaime ++ ) {
    int cnt = 0 ;
    String left = S . substring ( 0 , sakaime ) ;
    String right = S . substring ( sakaime ) ;
    for ( int i = 0 ;
    i < abcs . length ( ) ;
    i ++ ) {
      String alpha = abcs . charAt ( i ) ;
      if ( alpha . contains ( left ) && alpha . contains ( right ) ) {
        cnt ++ ;
      }
    }
    ans = Math . max ( ans , cnt ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
