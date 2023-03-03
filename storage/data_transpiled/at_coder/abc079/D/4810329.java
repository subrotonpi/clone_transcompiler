public static void main ( String [ ] args ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > [ ] gList = new LinkedList [ 10 ] ;
  for ( int i = 0 ;
  i < gList . length ;
  i ++ ) {
    gList [ i ] = new LinkedList < Integer > ( ) ;
    for ( int j = 0 ;
    j < gList [ i ] . size ( ) ;
    j ++ ) {
      gList [ i ] . add ( new Integer ( gList [ i ] . get ( j ) ) ) ;
    }
  }
  int [ ] minChange = new int [ 10 ] ;
  for ( int j = 0 ;
  j < minChange . length ;
  j ++ ) {
    minChange [ j ] = gList [ i ] . get ( j ) . intValue ( ) ;
  }
  int [ ] flag = new int [ 10 ] ;
  for ( int j = 0 ;
  j < flag . length ;
  j ++ ) {
    flag [ j ] = 0 ;
  }
  ArrayList < Integer > tep = new ArrayList < Integer > ( ) ;
  for ( int j = 0 ;
  j < minChange . length ;
  j ++ ) {
    tep . add ( new Integer ( j ) ) ;
  }
  int minG = Collections . min ( tep , new Comparator < Integer > ( ) {
    public int compare ( Integer a , Integer b ) {
      return a . compareTo ( b ) ;
    }
  }
  ) . intValue ( ) ;
  flag [ minG ] = 1 ;
  while ( Integer . valueOf ( flag [ minG ] ) != 9 ) {
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      if ( gList [ j ] . get ( minG ) + minChange [ minG ] < minChange [ j ] ) {
        minChange [ j ] = gList [ j ] . get ( minG ) + minChange [ minG ] ;
      }
    }
    tep . add ( new Integer ( k ) ) ;
  }
  if ( tep . size ( ) != 0 && minChange [ minG ] != - 1 ) {
    minG = Collections . min ( tep , new Comparator < Integer > ( ) {
      public int compare ( Integer a , Integer b ) {
        return a . compareTo ( b ) ;
      }
    }
    ) ;
  }
  System . out . println ( new String ( ) ) ;
}
