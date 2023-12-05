@ VisibleForTesting static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] td = new int [ n ] [ n ] ;
  final SortedMap < Integer , List < Integer >> group = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    td [ i ] = Collections . reverseOrder ( ) ;
    group . put ( td [ i ] [ 0 ] , td [ i ] [ 1 ] ) ;
  }
  final List < List < Integer >> grouplist = new ArrayList < > ( group . values ( ) ) ;
  for ( List < Integer > g : grouplist ) {
    Collections . sort ( g , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return - o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
  }
  Collections . sort ( grouplist , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      final int remove = o1 . size ( ) - o2 . size ( ) ;
      return remove > 0 ? 1 : 0 ;
    }
  }
  ) ;
  final List < Integer > nonMaxes = new ArrayList < > ( ) ;
  int result = 0 ;
  int base = 0 ;
  for ( int i = 0 ;
  i < Math . min ( grouplist . size ( ) , k ) ;
  i ++ ) {
    final int bonus = ( i + 1 ) * ( i + 1 ) ;
    for ( int j = 0 ;
    j < grouplist . size ( ) ;
    j ++ ) {
      final int basic = grouplist . get ( i ) ;
      if ( j == 0 ) {
        if ( nonMaxes . size ( ) > k - ( i + 1 ) ) {
          final int remove = heapheappop ( nonMaxes ) ;
          if ( remove > 0 ) {
            base += basic - remove ;
          }
          base += basic - remove ;
        }
        else if ( nonMaxes . size ( ) < k - ( i + 1 ) ) {
          heappush ( nonMaxes , basic ) ;
          base += basic ;
        }
        else if ( nonMaxes . size ( ) > 0 && nonMaxes . get ( 0 ) < basic ) {
          base += basic - nonMaxes . get ( 0 ) ;
          heapreplace ( nonMaxes ,