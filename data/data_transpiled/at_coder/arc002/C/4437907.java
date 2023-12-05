@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String c = input . nextLine ( ) ;
  List < String > pairs = Lists . newArrayList ( ) ;
  for ( String s : pairs ) {
    pairs . add ( s ) ;
  }
  int cmdMin = c . length ( ) ;
  for ( String l : pairs ) {
    int r = c . replace ( l , 'L' ) . replace ( r , 'R' ) . length ( ) ;
    if ( cmdMin > cmdCnt ) {
      cmdMin = cmdCnt ;
    }
  }
  System . out . println ( cmdMin ) ;
  return pairs ;
}
