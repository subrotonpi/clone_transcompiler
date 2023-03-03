public static int search ( Map < Integer , List < Integer >> tree , int root , int parent ) throws IOException {
  List < Integer > children = tree . get ( root ) . stream ( ) . map ( tree :: get ) . collect ( Collectors . toList ( ) ) ;
  if ( parent != 0 ) {
    children . remove ( children . indexOf ( parent ) ) ;
  }
  if ( children . size ( ) <= 1 ) {
    return 1 ;
  }
  int firstlarge = 0 ;
  int secondlarge = 0 ;
  for ( int child : children ) {
    int result = search ( tree , child , root ) ;
    if ( result > firstlarge ) {
      secondlarge = firstlarge ;
      firstlarge = result ;
    }
    else if ( result > secondlarge ) {
      secondlarge = result ;
    }
  }
  return firstlarge + secondlarge + 1 ;
}
