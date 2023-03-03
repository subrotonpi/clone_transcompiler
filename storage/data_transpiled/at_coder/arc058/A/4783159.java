public static int N = Integer . parseInt ( input ) {
  List < String > D = Arrays . asList ( String . valueOf ( input . length ( ) ) ) ;
  for ( int i = N ;
  i < 100000 ;
  i ++ ) {
    Set < String > S = Collections . singleton ( String . valueOf ( i ) ) ;
    for ( String s : S ) {
      if ( s . contains ( D ) ) break ;
    }
  }
  System . out . println ( i ) ;
  return 0 ;
}
