public static int [ ] [ ] solve ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  HashMap < Integer , HashSet < Integer >> road = new HashMap < Integer , HashSet < Integer >> ( ) ;
  ArrayList < Integer > whole = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    whole . add ( i ) ;
    road . put ( i , new HashSet < Integer > ( ) ) ;
  }
  int left = ( n + 1 ) ;
  int right = ( n - left ) / 2 ;
  int result = ( left * ( left - 1 ) + right * ( right - 1 ) ) / 2 ;
  System . out . println ( result ) ;
  int [ ] [ ] taka = new int [ m ] [ n ] ;
  int hashi = new int [ m ] ;
  HashSet < Integer > used = new HashSet < Integer > ( ) ;
  int no = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    HashSet < Integer > l = new HashSet < Integer > ( ) ;
    HashSet < Integer > r = new HashSet < Integer > ( ) ;
    ArrayList < Integer > l1 = new ArrayList < Integer > ( ) ;
    ArrayList < Integer > r1 = new ArrayList < Integer > ( ) ;
    if ( used . contains ( i ) ) {
      continue ;
    }
    else {
      l . add ( i ) ;
      l1 . add ( i ) ;
      used . add ( i ) ;
      for ( int y = whole . minus ( road . get ( i ) ) ;
      y >= 0 ;
      y -- ) {
        if ( ! used . contains ( y ) ) {
          r . add ( y ) ;
          r1 . add ( y ) ;
          used . add ( y ) ;
        }
      }
    }
    while ( l1 . size ( ) != 0 || r1 . size ( ) != 0 ) {
      while ( r1 . size ( ) != 0 ) {
        int t = r1 . remove ( r1 . size ( ) - 1 ) ;
        for ( int y = whole . minus ( road . get ( t ) ) - used . subtract ( l ) ;
        y >= 0 ;
        y -- ) {
          l . add ( y ) ;
          l1 . add ( y ) ;
          used . add ( y ) ;
        }
      }
      while ( l1 . size ( ) != 0 ) {
        int t = l1 . remove ( r1 . size ( ) - 1 ) ;
        for ( int y = whole . minus