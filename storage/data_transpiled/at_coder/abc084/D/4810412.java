static final String getPrimeNumList ( ) {
  final int Q = Integer . parseInt ( input . readLine ( ) ) ;
  final List < Integer > maps = new ArrayList < > ( ) ;
  int rMax = 0 ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    maps . add ( new Integer ( l ) ) ;
    if ( rMax < r ) {
      rMax = r ;
    }
  }
  final int [ ] base = new int [ rMax + 1 ] ;
  int counts = 0 ;
  for ( int i = 0 ;
  i < rMax + 1 ;
  i ++ ) {
    if ( i == 0 || i == 1 ) {
      continue ;
    }
    if ( ( i + 1 ) % 2 == 0 && isPrime ( i ) == true ) {
      int tmp = ( i + 1 ) / 2 ;
      if ( isPrime ( tmp ) == true ) {
        counts ++ ;
      }
    }
    base [ i ] = counts ;
  }
  for ( int i : maps ) {
    int l = i ;
    int r = i ;
    System . out . println ( base [ r ] - base [ l - 1 ] ) ;
  }
  return new String ( ) {
    @ Override public int [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
    @ Override public boolean [ ] getPrimeNumList ( ) {
      return base ;
    }
  }
  ;
}
