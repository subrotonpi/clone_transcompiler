public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ v [ i ] ] = 0 ;
    d [ v [ i ] ] ++ ;
  }
  int [ ] c = new int [ n + 1 ] ;
  Arrays . sort ( c ) ;
  c [ 0 ] = 0 ;
  d [ 0 ] = 0 ;
  int [ ] fact = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    fact [ i + 1 ] = 1 ;
  }
  int ave = 0 ;
  int cnt = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    int t = i ;
    int cur = 0 ;
    int sum = 0 ;
    while ( ( cur < c . length - 1 ) && d [ c [ cur ] ] <= t ) {
      sum += c [ cur ] * d [ c [ cur ] ] ;
      t -= d [ c [ cur ] ] ;
      cur ++ ;
    }
    sum += c [ cur ] * t ;
    if ( ave < ( sum / i ) ) {
      ave = sum / i ;
      cnt = fact [ d [ c [ cur ] ] ] / fact [ t ] / fact [ d [ c [ cur ] ] - t ] ;
    }
    else if ( ave == ( sum / i ) ) {
      cnt += fact [ d [ c [ cur ] ] ] / fact [ t ] / fact [ d [ c [ cur ] ] - t ] ;
    }
  }
  System . out . println ( ave ) ;
  System . out . println ( cnt ) ;
  return cnt ;
}
