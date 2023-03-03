public static int [ ] [ ] data ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  List < Point > list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    List < Point > l = new LinkedList < > ( ) ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      l . add ( new Point ( l . get ( j ) , i + 1 , j + 1 ) ) ;
    }
  }
  Collections . sort ( list , new Comparator < Point > ( ) {
    public int compare ( Point o1 , Point o2 ) {
      return o2 . x . compareTo ( o1 . x ) ;
    }
  }
  ) ;
  int [ ] [ ] dis = new int [ h * w + 1 ] [ ] ;
  for ( int i = h * w ;
  i > 0 ;
  i -- ) {
    if ( i - d < 1 ) break ;
    int x1 = list . get ( i - d - 1 ) . y ;
    int y1 = list . get ( i - d - 1 ) . x ;
    int x2 = list . get ( i - d - 1 ) . y ;
    int y2 = list . get ( i - 1 ) . z ;
    dis [ i - d ] = dis [ i ] + Math . abs ( x1 - x2 ) + Math . abs ( y1 - y2 ) ;
  }
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( dis [ l ] - dis [ r ] ) ;
  }
}
