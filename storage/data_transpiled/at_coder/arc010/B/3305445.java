public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] md = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    md [ i ] = new int [ ] {
      m , d }
      ;
    }
    Arrays . sort ( md ) ;
    int stored = 0 ;
    int streak = 0 ;
    int maStreak = 0 ;
    Calendar cal = Calendar . getInstance ( ) ;
    cal . set ( 2012 , 1 , 1 ) ;
    for ( int i = 0 ;
    i < 366 ;
    i ++ ) {
      cal . add ( Calendar . DAY_OF_MONTH , 1 ) ;
      boolean isHoliday = ( cal . get ( Calendar . MONTH ) == 1 ) ;
      isHoliday = true ;
    }
  }
  