@ GwtIncompatible ( "java.util.regex.Pattern" ) public static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String S = input ;
  char [ ] A = S . toCharArray ( ) ;
  char [ ] B = S . toCharArray ( ) ;
  B = B . toCharArray ( ) ;
  {
    Map < Pair < String , String > , Integer > dd = new LinkedHashMap < > ( ) ;
    for ( int i = 0 ;
    i < 1 << N ;
    i ++ ) {
      char a = '' ;
      char b = '' ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( ( i & ( 1 << j ) ) != 0 ) {
          a += A [ j ] ;
        }
        else {
          b += A [ j ] ;
        }
      }
      dd . put ( new Pair ( a , b ) , 1 ) ;
    }
    return dd . size ( ) ;
  }
}
