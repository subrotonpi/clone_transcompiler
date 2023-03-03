@ Sys . Internal public static void main ( String ... args ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int [ ] lWord = in . nextLine ( ) . split ( "\\s+" ) ;
  final int [ ] cWord = in . nextLine ( ) . split ( "\\s+" ) ;
  final int [ ] rgWord = new int [ cWord . length ] ;
  for ( int iWord = 0 ;
  iWord <= lWord . length ;
  iWord ++ ) rgWord [ iWord ] = in . nextLine ( ) . split ( "\\s+" ) ;
  for ( int iCase = 0 ;
  iCase <= cCase . length ;
  iCase ++ ) {
    final Pattern regex = Pattern . compile ( lWord [ iWord ] . replace ( '(' , '[' ) . replace ( ')' , ']' ) ) ;
    System . out . println ( "Case #" + ( iCase + 1 ) + ": " + Stream . of ( rgWord ) . filter ( x -> regex . matcher ( x ) . matches ( ) ) . count ( ) ) ;
    stdout . flush ( ) ;
  }
}
