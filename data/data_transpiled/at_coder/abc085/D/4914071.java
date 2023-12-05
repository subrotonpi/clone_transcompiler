static final int [ ] [ ] getTimes ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , h = 0 ;
  Tuple [ ] t = new Tuple [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    t [ i ] = new Tuple [ ] {
      a , "a" }
      ;
      t [ i ] = new Tuple [ ] {
        b , "b" }
        ;
      }
      Arrays . sort ( t , new Comparator < Tuple > ( ) {
        public int compare ( Tuple o1 , Tuple o2 ) {
          return o1 . compareTo ( o2 ) ;
        }
      }
      ) ;
      int c = 0 ;
      int i = 0 ;
      while ( h > 0 ) {
        if ( t [ i ] . getValue ( ) == 1 ) {
          h -= t [ i ] . getValue ( ) ;
          c ++ ;
          i ++ ;
        }
        else {
          c += Math . ceil ( h / t [ i ] . getValue ( ) ) ;
          h = 0 ;
        }
      }
      System . out . println ( c ) ;
      return t ;
    }
    