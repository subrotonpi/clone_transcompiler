public static void main ( String [ ] input ) {
  L = Integer . parseInt ( input [ 0 ] ) ;
  R = Integer . parseInt ( input [ 1 ] ) ;
  List < Integer > lList = new ArrayList < Integer > ( Collections . singletonList ( L ) ) ;
  List < Integer > rList = new ArrayList < Integer > ( Collections . singletonList ( R ) ) ;
  int lIndex = 0 ;
  int rIndex = 0 ;
  int c = 0 ;
  while ( true ) {
    if ( lList . get ( lIndex ) == rList . get ( rIndex ) ) {
      lIndex ++ ;
      rIndex ++ ;
      c ++ ;
    }
    else if ( lList . get ( lIndex ) > rIndex ) rIndex ++ ;
    else lIndex ++ ;
    if ( lIndex == lList . size ( ) || rIndex == rList . size ( ) ) break ;
  }
  System . out . println ( c ) ;
}
