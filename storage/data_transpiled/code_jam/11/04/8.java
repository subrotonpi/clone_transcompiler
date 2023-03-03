public static String getPermutation ( List < String > L1 , List < String > L2 ) throws IOException {
  if ( new ArrayList < String > ( L1 ) . size ( ) != new ArrayList < String > ( L2 ) . size ( ) ) throw new IllegalArgumentException ( "L2 must be permutation of L1 (" + L1 + ", " + L2 + ")" ) ;
  String [ ] permutation = CollectionUtils . toArray ( Collections . nCopies ( L2 . size ( ) , String [ ] . class ) , new String [ L2 . size ( ) ] ) ;
  assert Arrays . equals ( L1 . get ( permutation ) , L2 ) ;
  return permutation ;
}
