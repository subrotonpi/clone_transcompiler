public static void print ( int x , int y , int r ) {
  int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    return ( ( p - n ) * ( p - n ) + ( q - m ) * ( q - m ) ) * 0.5 < r ;
  }
  List < Integer > e = new ArrayList < Integer > ( ) ;
  for ( int i = x1 ;
  i <= y1 ;
  i ++ ) {
    e . add ( f ( new int [ ] {
      x , y }
      ) + i ) ;
    }
    List < Integer > f = new ArrayList < Integer > ( ) ;
    for ( int s = x1 ;
    s <= x2 && y1 <= t && s <= y2 ;
    s ++ ) {
      f . add ( x1 <= s && s <= x2 && y1 <= t && t <= y2 ) ;
    }
    if ( CollectionUtils . isEmpty ( e ) && CollectionUtils . isEmpty ( f ) ) {
      System . out . println ( "YES" ) ;
      System . out . println ( "YES" ) ;
    }
    else if ( Arrays . equals ( e . toArray ( ) , f . toArray ( ) ) ) {
      System . out . println ( "YES" ) ;
      System . out . println ( "NO" ) ;
    }
    else if ( Arrays . equals ( e . toArray ( ) , f . toArray ( ) ) ) {
      System . out . println ( "NO" ) ;
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "YES" ) ;
      System . out . println ( "YES" ) ;
    }
  }
  