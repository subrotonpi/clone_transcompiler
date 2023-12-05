public static int [ ] first ( String first , String last ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > words = new ArrayList < String > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) words . add ( input . nextLine ( ) ) ;
  words . add ( 0 , first ) ;
  words . add ( last ) ;
  /* debugPrint */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String row = t . nextLine ( ) ;
    System . out . println ( i + ":" + row ) ;
  }
  /* isCandidate */
  boolean r = false ;
  for ( String w1 : words ) {
    String s2 = w1 . substring ( 0 , i ) ;
    if ( s1 . equals ( s2 ) ) count ++ ;
  }
  if ( w1 . length ( ) - count == 1 ) r = true ;
  /* printPath */
  class Path {
    private Path {
      String word , prev ;
      public Path ( String word , Path prev ) {
        this . prev = prev ;
        this . word = word ;
      }
      public void printPath ( ) {
        if ( prev != null ) prev . printPath ( ) ;
        System . out . println ( ( word = word ) ) ;
      }
      public int countPrev ( int n ) {
        if ( prev == null ) return - 1 ;
        return prev . countPrev ( n + 1 ) + 1 ;
      }
    }
  }
  /* bfs */
  List < Path > ans = new ArrayList < Path > ( ) ;
  Queue < Path > queue = new LinkedList < Path > ( ) ;
  int [ ] memo = new int [ n + 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans . add ( queue . poll ( ) ) ;
  }
  if ( s . equals ( g ) ) {
    System . out . println ( 0 ) ;
    System . out . println ( s ) ;
    System . out . println ( g ) ;
    return 0 ;
  }
  while ( queue . size ( ) > 0 ) {
    Path cur = queue . remove ( 0 ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String word = words . get ( i ) ;
      if ( memo [ i ] == 0 && ! word . equals ( g ) ) {
        if ( isCandidate ( word , cur . word ) ) {
          if ( word . equals ( g ) ) {
            cur = new Path ( word , cur )