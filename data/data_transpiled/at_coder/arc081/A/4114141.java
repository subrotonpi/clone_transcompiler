public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  int [ ] e = new int [ N ] ;
  int i = 0 ;
  while ( i < N - 1 ) {
    if ( A . get ( i ) == A . get ( i + 1 ) ) {
      e [ 0 ] = A . get ( i ) ;
      if ( e . length == 2 ) {
        System . out . println ( e [ 0 ] * e [ 1 ] ) ;
        return ;
      }
      i += 2 ;
    }
    else {
      i ++ ;
    }
  }
  System . out . println ( 0 ) ;
}
