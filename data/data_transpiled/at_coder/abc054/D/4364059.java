static List < Integer > n = Lists . newArrayList ( ) , ma = Lists . newArrayList ( ) , mb = Lists . newArrayList ( ) , ans = 100 * n + 1 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int sub = a * mb - b * ma ;
  if ( sub > 0 ) {
    poss . add ( new Integer ( sub ) ) ;
  }
  else if ( sub < 0 ) {
    negs . add ( new Integer ( - sub ) ) ;
  }
  else {
    ans = Math . min ( c , ans ) ;
  }
}
{
  Map < Integer , Integer > ret = new HashMap < > ( ) ;
  ret . put ( 0 , 0 ) ;
  for ( Map . Entry < Integer , Integer > entry : tups . entrySet ( ) ) {
    Integer x = entry . getKey ( ) ;
    int c = ret . get ( x ) ;
    for ( int x0 = 0 ;
    x0 < tmp . size ( ) ;
    x0 ++ ) {
      Integer c0 = tmp . get ( x0 ) ;
      if ( c0 >= 0 ) {
        ret . put ( x + x0 , c0 ) ;
      }
    }
  }
  return ret ;
}
