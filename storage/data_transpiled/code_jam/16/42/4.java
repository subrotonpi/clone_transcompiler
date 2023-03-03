@ InputFunction public static void input ( ) {
  final int [ ] [ ] product = new int [ l . length ] [ l [ 0 ] . length ] ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    double x = 1. ;
    for ( double u : l [ i ] ) x *= u ;
    return ;
  }
  {
    double max = 0 ;
    for ( int i = 0 ;
    i < l . length ;
    i ++ ) {
      double [ ] c = new double [ l [ i ] . length ] ;
      for ( int j = 0 ;
      j < c . length ;
      j ++ ) {
        double s = 0 ;
        for ( int z = 0 ;
        z < c . length ;
        z ++ ) s += product [ z ] * product [ i ] * product [ 1. - l [ i ] . length ] ;
        if ( ! c [ j ] [ i ] . equals ( max ) ) max = s ;
      }
      if ( max > maxi ) max = s ;
    }
  }
  final int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . printf ( "Case #%s:%n" , i + 1 ) ;
    final int n = Integer . parseInt ( input . nextLine ( ) ) ;
    final int k = Integer . parseInt ( input . nextLine ( ) ) ;
    final double [ ] l = Double . parseDouble ( input . nextLine ( ) ) ;
    System . out . printf ( "Case #%s:%n" , k ) ;
  }
}
