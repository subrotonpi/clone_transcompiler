@ VisibleForTesting static String from ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = map . get ( input . nextLine ( ) ) ;
  final int [ ] counts = new int [ N ] ;
  int mod = N % 2 ;
  for ( int a : A ) {
    if ( a % 2 == mod ) {
      System . out . println ( ) ;
    }
    counts [ a ] ++ ;
  }
  return counts [ a ] ;
}
