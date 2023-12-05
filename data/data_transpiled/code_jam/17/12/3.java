public static void main ( String input ) {
  final int nTestcases = Integer . parseInt ( input . trim ( ) ) ;
  final int nCases = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  for ( int testcaseN = 1 ;
  testcaseN <= nTestcases ;
  ++ testcaseN ) {
    final int n = Integer . parseInt ( input . substring ( 1 , testcaseN ) ) ;
    final int p = Integer . parseInt ( input . substring ( testcaseN , testcaseN ) ) ;
    final int [ ] r = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      r [ i ] = Integer . parseInt ( input . substring ( testcaseN , i ) ) ;
    }
    final List < List < Fraction >> q = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      q . add ( new LinkedList < > ( ) ) ;
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
      }
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        q . add ( new LinkedList < > ( ) ) ;
        for ( int j = 0 ;
        j < n ;
        ++ j ) {
          q . add ( new LinkedList < > ( ) ) ;
        }
        for ( int j = 0 ;
        j < n ;
        ++ j ) {
          q . add ( new LinkedList < > ( ) ) ;
        }
      }
      indexes = new LinkedList < > ( ) ;
      for ( int j = 0 ;
      j < n ;
      ++ j ) {
        indexes . add