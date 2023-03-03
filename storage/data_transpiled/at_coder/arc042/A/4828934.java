public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > preA = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) preA . add ( Integer . parseInt ( input ) ) ;
  Set < Integer > A = new HashSet < > ( ) ;
  for ( int a : new ArrayList < > ( preA ) ) {
    if ( ! A . contains ( a ) ) {
      System . out . println ( a ) ;
      A . add ( a ) ;
    }
  }
  Set < Integer > setA = new HashSet < > ( A ) ;
  Set < Integer > setN = new HashSet < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) setN . add ( i ) ;
  List < Integer > diff = new ArrayList < > ( Collections . list ( setN ) ) ;
  diff . sort ( ) ;
  for ( Integer d : diff ) {
    System . out . println ( d ) ;
  }
}
