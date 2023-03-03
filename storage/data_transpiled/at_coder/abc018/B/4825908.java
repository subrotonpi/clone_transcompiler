private static String S = "S" + input . next ( ) + "E" ;
int N = Integer . parseInt ( input . next ( ) ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int l = Integer . parseInt ( input . next ( ) ) ;
  int r = Integer . parseInt ( input . next ( ) ) ;
  String S1 ;
  String S3 ;
  if ( r == S . length ( ) - 2 ) {
    S3 = "" ;
  }
  else {
    S3 = S . substring ( r + 1 , S . length ( ) - 1 ) ;
  }
  S2 = S3 ;
}
