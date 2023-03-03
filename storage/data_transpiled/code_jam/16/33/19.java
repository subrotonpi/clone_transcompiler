static String printOutfits ( int [ ] outfits ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final Scanner inpDumbScanner = new Scanner ( new File ( System . out ) ) ;
  final int nTests = Integer . parseInt ( in . nextLine ( ) ) ;
  inpDumbScanner . nextLine ( ) ;
  for ( int i = 0 ;
  i < nTests ;
  i ++ ) {
    final int ans = solveTest ( in ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ans + ": " ) ;
  }
  out . close ( ) ;
  final int [ ] counts = new int [ outfits . length ] ;
  for ( int j = 0 ;
  j < outfits . length ;
  j ++ ) {
    final int p = outfits [ j ] ;
    final int c = outfits [ p ] ;
    counts [ ( j , p , 0 ) + 1 ] = counts [ ( j , p , 0 ) + 1 ] ;
    counts [ ( j , 0 , c ) + 1 ] = counts [ ( j , p , c ) + 1 ] ;
    counts [ ( 0 , p , c ) + 1 ] = counts [ ( 0 , p , c ) + 1 ] ;
  }
  return Collections . max ( counts ) ;
}
