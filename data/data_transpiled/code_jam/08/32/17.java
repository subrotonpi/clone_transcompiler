@ GwtIncompatible ( "java.util.Scanner" ) private static File [ ] [ ] opn ( ) throws IOException {
  return opn ( ) . map ( new FileReader ( "B-small-attempt2.in.txt" ) , new FileWriter ( "B-small.out" ) ) . toArray ( new File [ 0 ] ) ;
}
