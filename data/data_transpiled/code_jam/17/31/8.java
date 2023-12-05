static final void init ( ) throws IOException {
  System . setIn ( new FileInputStream ( "A-large.in" ) ) ;
  System . setOut ( new FileOutputStream ( "A-large.out" ) ) ;
  final double pi = 3.1415926535897932384626433832 ;
  final double wid = rh . x * rh . x ;
  final double ht = 2 * rh . x * rh . y ;
  for ( int t = 0 ;
  t < Integer . parseInt ( input ( ) ) ;
  t ++ ) {
    final int n = Integer . parseInt ( input ( ) ) ;
    final int k = Integer . parseInt ( input ( ) ) ;
    final int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = tuple ( Integer . parseInt ( input ( ) ) ) ;
    }
    Arrays . sort ( a , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    double r = 0 ;
    int [ ] side = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double tr = 0 ;
      for ( int j = 0 ;
      j < Math . min ( i , k - 1 ) ;
      j ++ ) {
        tr += side [ j ] ;
      }
      r = Math . max ( r , tr + wid ( a [ i ] ) + ht ( a [ i ] ) ) ;
      side [ i ] = ht ( a [ i ] ) ;
      Arrays . sort ( side , new Comparator < Integer > ( ) {
        public int compare ( Integer o1 , Integer o2 ) {
          return - o1 . compareTo ( o2 ) ;
        }
      }
      ) ;
    }
    System . out . println ( String . format ( "Case #%d: %.9f" , t + 1 , pi * r ) ) ;
  }
}
