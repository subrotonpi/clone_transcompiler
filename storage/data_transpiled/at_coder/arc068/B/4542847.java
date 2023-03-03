@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Arrays . asList ( N ) ;
  Map < Integer , Integer > dd = new HashMap < > ( ) ;
  for ( Integer a : A ) dd . put ( a , 1 ) ;
  int num = 0 ;
  int s = 0 ;
  for ( Map . Entry < Integer , Integer > p : dd . entrySet ( ) ) {
    num ++ ;
    if ( p . getValue ( ) % 2 == 0 ) {
      s ++ ;
      s %= 2 ;
    }
  }
  System . out . println ( num - s ) ;
}
