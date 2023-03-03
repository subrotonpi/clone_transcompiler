@ VisibleForTesting static int binarySearch ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < String > As = new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ;
  final List < String > Bs = new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ;
  final List < Integer > Cs = new ArrayList < > ( ) ;
  for ( int i = Bs . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    Cs . add ( C . get ( i ) ) ;
  }
  bCounts = new ArrayList < > ( ) ;
  for ( String a : As ) {
    int i = Arrays . binarySearch ( Bs , a ) ;
    if ( i >= Bs . size ( ) ) {
      continue ;
    }
    total += bCounts . get ( i ) ;
  }
  System . out . println ( total ) ;
  return N ;
}
