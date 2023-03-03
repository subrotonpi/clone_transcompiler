@ Function public static int from ( ) {
  final int YEAR = 2012 ;
  {
    final List < Date > a = new ArrayList < > ( ) ;
    final int n = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final int m = Integer . parseInt ( input . nextLine ( ) ) ;
      final int d = Integer . parseInt ( input . nextLine ( ) ) ;
      a . add ( new Date ( YEAR , m , d ) ) ;
    }
    System . out . println ( solve ( a ) ) ;
  }
  private static int solve ( final List < Date > a ) {
    final int [ ] s = new int [ 366 ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = 0 ;
    }
    return s [ i ] ;
  }
}
