public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > lstA = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lstA . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > setA = new ArrayList < Integer > ( ) ;
  Collections . sort ( setA ) ;
  Map < Integer , Integer > dica2b = new HashMap < Integer , Integer > ( ) ;
  for ( int v = 0 ;
  v < setA . size ( ) ;
  v ++ ) {
    dica2b . put ( setA . get ( v ) , v ) ;
  }
  for ( int a : lstA ) {
    Integer b = dica2b . get ( a ) ;
    System . out . println ( b ) ;
  }
}
