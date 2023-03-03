private static final int DOM_2012 = new int [ ] {
  0 , 31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
  ;
  int day = 0 ;
  int m = 0 ;
  int d = 0 ;
  int i ;
  int [ ] IS_HOLI = new int [ 366 ] ;
  for ( i = 0 ;
  i < 366 ;
  i ++ ) {
    IS_HOLI [ i ] = i % 7 == 0 || i % 6 == 0 ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( ;
  ;
  ) {
    m = Integer . parseInt ( input . nextLine ( ) ) ;
    d = Integer . parseInt ( input . nextLine ( ) ) ;
  }
}
