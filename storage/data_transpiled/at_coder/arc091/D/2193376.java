public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  boolean grundy = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int k = input . length ( ) ;
    while ( a % k != 0 ) {
      int p = a / k ;
      int q = a % k ;
      a -= ( p + 1 ) * ( ( p + q ) / ( p + 1 ) ) ;
    }
    grundy ^= a / k ;
  }
  System . out . println ( grundy ? "Takahashi" : "Aoki" ) ;
}
