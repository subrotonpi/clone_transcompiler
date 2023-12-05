public static int [ ] [ ] createCost ( int h , int w , int d ) {
  int [ ] [ ] tab = new int [ w * h ] [ w * h ] ;
  for ( int hi = 0 ;
  hi < h ;
  hi ++ ) {
    int [ ] t = new int [ w ] ;
    for ( int wi = 0 ;
    wi < w ;
    wi ++ ) {
      t [ wi ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( int wi = 0 ;
    wi < w ;
    wi ++ ) {
      tab [ t [ wi ] - 1 ] [ hi ] = wi ;
    }
  }
  int [ ] cost = new int [ w * h ] ;
  for ( int i = d ;
  i < w * h ;
  i ++ ) {
    int [ ] a = tab [ i - d ] ;
    int [ ] b = tab [ i ] ;
    cost [ i ] = Math . abs ( a [ 0 ] - b [ 0 ] ) + Math . abs ( a [ 1 ] - b [ 1 ] ) + cost [ i - d ] ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( cost [ r - 1 ] - cost [ l - 1 ] ) ;
  }
  return cost ;
}
