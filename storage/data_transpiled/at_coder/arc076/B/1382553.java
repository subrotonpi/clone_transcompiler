@ VisibleForTesting static void heapify ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Point > xLoc = new ArrayList < > ( ) , yLoc = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    xLoc . add ( new Point ( x , i ) ) ;
    yLoc . add ( new Point ( y , i ) ) ;
  }
  Collections . sort ( xLoc ) ;
  Collections . sort ( yLoc ) ;
  List < Set < Point >> links = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    links . add ( new HashSet < > ( ) ) ;
  }
  Iterator < Point > x1 = xLoc . iterator ( ) ;
  int i1 = x1 . next ( ) ;
  Iterator < Point > x2 = x2 . iterator ( ) ;
  int i2 = y1 . next ( ) ;
  int dist = Math . abs ( x1 . minus ( x2 ) ) ;
  links . get ( i1 ) . add ( new Point ( dist , i2 ) ) ;
  links . get ( i2 ) . add ( new Point ( dist , i1 ) ) ;
  Set < Integer > visited = new HashSet < > ( ) ;
  LinkedList < Point > queue = new LinkedList < > ( links . get ( 0 ) ) ;
  heapify ( queue ) ;
  int total = 0 ;
  while ( true ) {
    int cost = 0 ;
    Point i = links . get ( i ) ;
    if ( visited . contains ( i ) ) continue ;
    visited . add ( i ) ;
    total += cost ;
    if ( visited . size ( ) == n ) break ;
    for ( int cost2 : links . get ( i ) ) {
      int j = links . get ( j ) ;
      if ( visited . contains ( j ) ) continue ;
      heapify ( queue , cost2 ) ;
    }
  }
  System . out . println ( total ) ;
}
