@ VisibleForTesting static String toString ( final BufferedReader in ) throws IOException {
  return Arrays . stream ( in . readLine ( ) . split ( " " ) ) . map ( z -> Integer . parseInt ( z ) ) . collect ( Collectors . joining ( ) ) ;
}
