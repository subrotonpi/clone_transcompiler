public static int N = Integer . parseInt ( input ) {
  final long mod = 1000000007 ;
  final Map < String , Integer > data = Maps . newHashMap ( ) ;
  for ( String i : "ACGT" ) for ( String j : "AGCT" ) for ( String k : "ACGT" ) data . put ( "AGC" , 0 ) ;
  data . put ( "ACG" , 0 ) ;
  data . put ( "GAC" , 0 ) ;
  /* Check if the text contains a different string */
  if ( "AGC" . equals ( text . substring ( 1 , 2 ) ) ) return false ;
  if ( "AGC" . equals ( text . substring ( 0 , 2 ) ) ) return false ;
  if ( "AGC" . equals ( text . substring ( 0 , 2 ) ) ) return false ;
  if ( "AGC" . equals ( text . substring ( 0 , 1 ) ) ) return false ;
  else return true ;
  for ( int x = 0 ;
  x <= N - 3 ;
  x ++ ) {
    Map < String , Integer > newData = Maps . newHashMap ( ) ;
    for ( String y : data . keySet ( ) ) for ( String z : "ACGT" ) if ( data . containsKey ( y ) ) newData . put ( y . substring ( 1 , 2 ) + z , data . get ( y ) % mod ) ;
    data = newData . entrySet ( ) . stream ( ) . collect ( Collectors . toMap ( Map . Entry :: getKey , Map . Entry :: getValue ) ) ;
  }
  System . out . println ( Arrays . asList ( data . values ( ) ) % mod ) ;
  return 0 ;
}
