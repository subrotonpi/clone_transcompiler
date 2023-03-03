static final long MOD = 1000000007 ;
{
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] tn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tn [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > cnt = new HashMap < > ( ) ;
  for ( int t : tn ) {
    if ( cnt . containsKey ( t ) ) {
      cnt . put ( t , 1 ) ;
    }
    else {
      cnt . put ( t , 1 ) ;
    }
  }
  long now = 0 ;
  long pena = 0 ;
  for ( int t : cnt . keySet ( ) ) {
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      now += t ;
      pena += t ;
    }
  }
  long ways = 1 ;
  System . out . println ( pena ) ;
  return ways ;
}
