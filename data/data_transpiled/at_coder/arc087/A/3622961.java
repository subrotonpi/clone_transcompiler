@ VisibleForTesting static < C extends Comparable < C >> C < C > of ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  a . sort ( ) ;
  C < C > c = new C ( a ) ;
  int res = 0 ;
  Map < Integer , C > map = ( Map < Integer , C > ) c ;
  for ( int k : list ) {
    if ( map . get ( k ) < k ) {
      res += map . get ( k ) ;
    }
    else {
      res += map . get ( k ) - k ;
    }
  }
  System . out . println ( res ) ;
  return c ;
}
