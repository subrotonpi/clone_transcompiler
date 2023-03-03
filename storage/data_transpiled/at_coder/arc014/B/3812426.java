public static int N = Integer . parseInt ( input ) {
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W [ i ] = input . nextInt ( ) ;
  }
  List < String > words = new ArrayList < String > ( ) ;
  words . add ( W [ 0 ] ) ;
  int turn = 0 ;
  for ( int i = 1 ;
  i < W . length ;
  i ++ ) {
    if ( words . contains ( W [ i ] ) || words . get ( i ) . charAt ( 0 ) != words . get ( i - 1 ) . charAt ( words . get ( i - 1 ) . charAt ( 0 ) ) ) {
      System . out . println ( Arrays . toString ( "WIN" ) + " LOSE" [ turn % 2 ] ");exit();}words.add(W[i]);turn++;}System.out.println(" DRAW " ) ; return 0 ; }