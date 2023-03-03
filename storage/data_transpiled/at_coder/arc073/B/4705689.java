public static void print ( int n , int w ) {
  Map < Integer , List < Integer >> wd = new HashMap < Integer , List < Integer >> ( ) ;
  int minw = Integer . parseInt ( input . nextLine ( ) ) ;
  int v = Integer . parseInt ( input . nextLine ( ) ) ;
  wd . put ( minw , new ArrayList < Integer > ( v ) ) ;
  wd . put ( minw + 1 , new ArrayList < Integer > ( ) ) ;
  wd . put ( minw + 2 , new ArrayList < Integer > ( ) ) ;
  wd . put ( minw + 3 , new ArrayList < Integer > ( ) ) ;
  for ( int _ = 0 ;
  _ < n - 1 ;
  _ ++ ) {
    int _w = Integer . parseInt ( input . nextLine ( ) ) ;
    v = Integer . parseInt ( input . nextLine ( ) ) ;
    wd . get ( _w ) . add ( v ) ;
  }
  for ( Map . Entry < Integer , List < Integer >> e : wd . entrySet ( ) ) {
    wd . put ( e . getKey ( ) , Collections . unmodifiableList ( e . getValue ( ) ) ) ;
  }
  int maxw = 0 ;
  for ( int i = 0 ;
  i < w / minw + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < ( w - minw * i ) / ( minw + 1 ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < ( w - minw * i - ( minw + 1 ) * j ) / ( minw + 2 ) ;
      k ++ ) {
        int l = ( w - minw * i - ( minw + 1 ) * j - ( minw + 2 ) * k ) / ( minw + 3 ) ;
        int tmp = Integer . parseInt ( wd . get ( minw ) . get ( i ) ) + Integer . parseInt ( wd . get ( minw + 1 ) . get ( j ) ) + Integer . parseInt ( wd . get ( minw + 2 ) . get ( k ) ) + Integer . parseInt ( wd . get ( minw + 3 ) ) ;
        if ( tmp > maxw ) {
          maxw = tmp ;
        }
      }
    }
  }
  System . out . println ( maxw ) ;
}
