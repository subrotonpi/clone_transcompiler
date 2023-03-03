static void n ( int m , String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] ps = new int [ n ] ;
  int [ ] xys = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    xys [ i ] = Integer . parseInt ( input ) ;
  }
  Map < Integer , Integer > t = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    t . put ( i , i ) ;
  }
  {
    List < Integer > route = new ArrayList < > ( ) ;
    route . add ( i ) ;
    while ( t . get ( i ) != i ) {
      i = t . get ( i ) ;
      route . add ( i ) ;
    }
    for ( int v : route ) {
      t . put ( v , route . get ( route . size ( ) - 1 ) ) ;
    }
  }
  for ( int i = 0 ;
  i < xys . length ;
  i ++ ) {
    int u = xys [ i ] ;
    int v = xys [ i ] ;
    if ( u != v ) {
      t . put ( u , v ) ;
    }
  }
  List < Integer > avs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < ps . length ;
  i ++ ) {
    avs . add ( ps [ i ] ) ;
  }
  System . out . println ( avs . size ( ) ) ;
}
