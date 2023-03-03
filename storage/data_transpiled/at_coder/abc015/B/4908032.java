@ VisibleForTesting static int ceil ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  a = Arrays . stream ( input . split ( " " ) ) . filter ( x -> Integer . parseInt ( x ) != 0 ) . count ( ) ;
  return N ;
}
