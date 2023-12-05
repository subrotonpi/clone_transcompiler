@ Nullable public static String from ( @ NotNull String input ) {
  int n = Integer . parseInt ( input ) ;
  Map < String , Integer > total = null ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Map < String , Integer > S = new HashMap < > ( ) ;
    for ( String s : input ) S . put ( s , 1 ) ;
    if ( i == 0 ) {
      total = S ;
      continue ;
    }
  }
  return total . keySet ( ) . toString ( ) ;
}
