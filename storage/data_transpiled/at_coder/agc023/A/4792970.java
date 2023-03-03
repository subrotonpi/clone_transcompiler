public static int [ ] getNum ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sa = new int [ n + 1 ] ;
  HashMap < Integer , Integer > numCnt = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < sa . length ;
  i ++ ) sa [ i ] = sa [ i ] + a [ i ] ;
  for ( int num : sa ) if ( num != null ) numCnt . put ( num , 1 ) ;
  return sa ;
}
