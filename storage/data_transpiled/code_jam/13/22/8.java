@ GwtIncompatible ( "B-small-attempt0" ) private static final int FILE_NAME_BASE = "B-small-attempt0" ;
final int NUM_PROCESSES = 0 ;
final double MEM_LIMIT_GB = 1.5 ;
final int RECURSION_LIMIT = 1000 ;
@ SuppressWarnings ( "resource" ) final Scanner in = new Scanner ( System . in ) ;
final int n = in . nextInt ( ) ;
final int x = in . nextInt ( ) ;
final int y = in . nextInt ( ) ;
while ( n < NUM_PROCESSES ) {
  int value = in . nextInt ( ) ;
  out . printf ( "Case #%d: %s\n" , ( value + 1 ) , value ) ;
  out . flush ( ) ;
}
if ( getClass ( ) . isEnum ( ) ) {
  Main . main ( ) ;
}
else {
  final Map < Integer , Double > freq = new LinkedHashMap < > ( ) ;
  final int mid = num + 1 ;
  freq . put ( new Integer ( ( mid - mid ) % 2 ) , 1.0 ) ;
  for ( final int num : xrange ( num ) ) {
    final Map < Integer , Double > newFreq = new LinkedHashMap < > ( ) ;
    for ( final Map . Entry < Integer , Double > height : freq . entrySet ( ) ) {
      final double chance = height . getValue ( ) ;
      final boolean fl = false ;
      final boolean fr = false ;
      final int l = height . getValue ( ) - 1 ;
      final int c = height . getValue ( ) ;
      final int r = height . getValue ( ) + 1 ;
      final boolean fl = false ;
      if ( l == c - 1 ) fl = true ;
      else if ( l == c + 1 ) fl = false ;
      else assert false ;
      if ( r == c - 1 ) fr = true ;
      else if ( r == c + 1 ) fr = false ;
      else assert false ;
      if ( fl && fr ) {
        fall ( height . getValue ( ) - 1 , chance / 2 ) ;
        fall ( height . getValue ( ) + 1 , chance / 2 ) ;
      }
      else if ( fl ) {
        fall ( height . getValue ( ) - 1 , chance ) ;
      }
      else if ( fr ) {
        fall ( height . getValue ( ) + 1 , chance ) ;
      }
      else {
        final Map < Integer , Double > newHeight = new LinkedHashMap < > ( ) ;
        newHeight . put ( height . getValue ( ) , 2 ) ;
        newFreq . put ( new Integer ( newHeight . size ( ) ) ,