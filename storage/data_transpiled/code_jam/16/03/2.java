static final int divisor ( int x ) {
  int d = 2 ;
  while ( d <= 1000 && d * d <= x ) {
    if ( x % d == 0 ) {
      return d ;
    }
    d ++ ;
  }
  {
    int tn = Integer . parseInt ( input . nextLine ( ) ) ;
    assert tn == 1 ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int j = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > ans = new ArrayList < > ( ) ;
    int x = ( 1 << ( n - 1 ) ) + 1 ;
    while ( ans . size ( ) < j ) {
      boolean ok = true ;
      int [ ] divs = new int [ j ] ;
      System . err . println ( "check: " + x ) ;
      for ( int base = 2 ;
      base < 11 ;
      base ++ ) {
        int value = 0 ;
        for ( int i = n - 1 ;
        i >= 0 ;
        i -- ) {
          value = value * base + ( x >> i ) % 2 ;
        }
        divs [ base ] = divisor ( value ) ;
        if ( divs [ base ] == 0 ) {
          ok = false ;
          break ;
        }
      }
      if ( ok ) {
        ans . add ( new Integer ( x ) ) ;
      }
      x += 2 ;
    }
    System . out . println ( "Case #1:" ) ;
    for ( int value : ans ) {
      int divs = value ;
      String binary = "" ;
      while ( value > 0 ) {
        binary = ( "" + ( value % 2 ) ) + binary ;
        value /= 2 ;
      }
      System . out . println ( binary + " " + Arrays . toString ( divs ) ) ;
    }
  }
}
