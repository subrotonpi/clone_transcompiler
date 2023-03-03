static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
  }
}
;
final Scanner input = new Scanner ( System . in ) ;
final int N = Integer . parseInt ( input . nextLine ( ) ) ;
final String S = input . nextLine ( ) ;
final String ABXY = "ABXY" ;
final List < String > strs = new ArrayList < > ( ) ;
for ( char [ ] x : ABXY . toCharArray ( ) ) {
  final String s = new String ( x ) ;
  strs . add ( s ) ;
}
double ans = 1e20 ;
for ( final String x : strs ) {
  for ( final String y : strs ) {
    int cnt = 0 ;
    int i = 0 ;
    while ( i < N ) {
      cnt ++ ;
      if ( S . substring ( i , i + 2 ) . equals ( x ) || S . substring ( i , i + 2 ) . equals ( y ) ) {
        i += 2 ;
      }
      else {
        i ++ ;
      }
    }
    ans = Math . min ( ans , cnt ) ;
  }
}
System . out . println ( ans ) ;
}
