@ java . io . CharStream . openStream ( "A-large2.in" ) public static DTree < String > read ( java . io . File f ) throws IOException {
  DTree < String > tree ;
  String stripped = f . getAbsolutePath ( ) . trim ( ) . substring ( 1 , f . getAbsolutePath ( ) . length ( ) - 1 ) . trim ( ) ;
  if ( stripped . contains ( " " ) ) {
    String weight = stripped . substring ( 0 , stripped . indexOf ( " " ) ) ;
    weight = Double . parseDouble ( weight ) ;
    String feature = stripped . substring ( stripped . indexOf ( "\n" ) + 1 ) ;
    rest = stripped . substring ( stripped . indexOf ( "\n" ) + 1 ) ;
    tree = new DTree < String > ( feature ) ;
    rest = rest . trim ( ) ;
    int d = 1 ;
    int idx = 1 ;
    while ( d > 0 ) {
      if ( rest . charAt ( idx ) == '(' ) d ++ ;
      else if ( rest . charAt ( idx ) == ')' ) d -- ;
      idx ++ ;
    }
    tree . one = new DTree < String > ( rest . substring ( 0 , idx ) . trim ( ) ) ;
    tree . two = new DTree < String > ( rest . substring ( idx ) . trim ( ) ) ;
  }
  else {
    tree = null ;
    weight = Double . parseDouble ( stripped ) ;
  }
  int N = Integer . parseInt ( f . getAbsolutePath ( ) . trim ( ) ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    System . out . println ( "Case #" + ( n + 1 ) + ":" ) ;
    int L = Integer . parseInt ( f . getAbsolutePath ( ) . trim ( ) ) ;
    StringBuffer l = new StringBuffer ( ) ;
    for ( int x = 0 ;
    x < L ;
    x ++ ) l . append ( f . readLine ( ) ) ;
    tree = new DTree < String > ( l . toString ( ) ) ;
    int A = Integer . parseInt ( f . getAbsolutePath ( ) . trim ( ) ) ;
    for ( int a = 0 ;
    a < A ;
    a ++ ) {
      String features [ ] = f . getAbsolutePath ( ) . split ( " " ) ;
      System . out . println ( tree . decide ( features ) + " " + features [ a ] ) ;
    }
  }
  return tree ;
}
