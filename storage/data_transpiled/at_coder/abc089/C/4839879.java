static final int [ ] getVariants ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hArray = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hArray [ i ] = input . nextInt ( ) ;
  }
  char [ ] MARCH = {
    'M' , 'A' , 'R' , 'C' , 'H' }
    ;
    int [ ] b = new int [ MARCH . length ] ;
    for ( int a = 0 ;
    a < MARCH . length ;
    a ++ ) {
      b [ a ] = MARCH [ a ] ;
    }
    Collection < Vector > bc = new ArrayList < Vector > ( ) ;
    int count = 0 ;
    for ( Vector v : bc ) {
      count += v . x * v . y * v . z ;
    }
    System . out . println ( count ) ;
    return b ;
  }
  