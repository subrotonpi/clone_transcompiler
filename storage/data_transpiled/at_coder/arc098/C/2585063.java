@ VisibleForTesting static void getAddList ( ) {
  final Map < Integer , List < Integer >> cache = new HashMap < > ( ) ;
  final List < Integer > list = new ArrayList < > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  final int q = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > aaa = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    aaa . add ( i ) ;
  }
  final Set < Integer > srt = new TreeSet < > ( ) ;
  srt . addAll ( aaa ) ;
  final List < Integer > lists = new ArrayList < > ( ) ;
  lists . add ( new Integer ( 0 ) ) ;
  ans = Double . MAX_VALUE ;
  list = getAddList ( ) ;
  for ( int a : srt ) {
    newLists . clear ( ) ;
    removables . clear ( ) ;
    for ( int s = 0 ;
    s < lists . size ( ) ;
    s ++ ) {
      int t = lists . get ( s ) ;
      int r = s ;
      for ( int i = 0 ;
      i < t ;
      i ++ ) {
        int b = aaa . get ( s ) ;
        if ( a > b ) {
          list . add ( r ) ;
          r = s + i + 1 ;
        }
      }
      list . add ( r ) ;
    }
    if ( removables . size ( ) < q ) break ;
    Collections . sort ( removables ) ;
    ans = Math . min ( ans , removables . get ( q - 1 ) - a ) ;
    lists = newLists ;
  }
  System . out . println ( ans ) ;
}
