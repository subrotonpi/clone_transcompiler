public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = list ( N ) ;
  HashMap < Integer , Integer > count = new HashMap < > ( ) ;
  for ( int a : A ) {
    if ( count . keySet ( ) . contains ( a ) ) count . put ( a , 1 ) ;
    else count . put ( a , 1 ) ;
  }
  List < Integer > v = new ArrayList < > ( count . values ( ) ) ;
  int ret = 0 ;
  for ( int i = K ;
  i < v . size ( ) ;
  i ++ ) {
    ret += v . get ( i ) ;
  }
  System . out . println ( ret ) ;
  return ret ;
}
