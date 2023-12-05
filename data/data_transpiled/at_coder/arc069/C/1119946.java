@ VisibleForTesting static int [ ] fromInputString ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Counter c = new Counter ( a ) ;
  List < Integer > values = Lists . reverse ( Arrays . asList ( a ) ) ;
  int s = 0 ;
  int m = 0 ;
  Map < Integer , Integer > above = Maps . newHashMap ( ) ;
  Map < Integer , Integer > nAbove = Maps . newHashMap ( ) ;
  for ( int v : values ) {
    above . put ( v , s ) ;
    nAbove . put ( v , m ) ;
    s += c . getCount ( v ) * v ;
    m += c . getCount ( v ) ;
  }
  above . put ( 0 , s ) ;
  nAbove . put ( 0 , m ) ;
  m = 0 ;
  List < Integer > u = new ArrayList < Integer > ( ) ;
  for ( int v : a ) {
    if ( v > m ) {
      u . add ( v ) ;
      m = v ;
    }
  }
  Map < Integer , Integer > r = new TreeMap < Integer , Integer > ( ) ;
  int last = 0 ;
  for ( int j = 0 ;
  j < u . size ( ) ;
  j ++ ) {
    r . put ( u . get ( j ) , last - ( above . getCount ( v ) - nAbove . getCount ( v ) * v ) ) ;
    last = above . getCount ( v ) - nAbove . getCount ( v ) * v ;
  }
  m = 0 ;
  for ( int v : a ) {
    if ( v > m ) {
      System . out . println ( r . get ( v ) ) ;
      m = v ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return r . values ( ) . toArray ( new Integer [ 0 ] ) ;
}
