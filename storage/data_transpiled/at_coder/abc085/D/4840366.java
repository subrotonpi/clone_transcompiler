@ VisibleForTesting static void main ( Scanner input ) {
  int N = input . nextInt ( ) , H = input . nextInt ( ) ;
  Tuple < Integer , Integer > [ ] ab = new Tuple [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ab [ i ] = new Tuple < > ( ) ;
    for ( int n = input . nextInt ( ) ;
    n > 0 ;
    n -- ) {
      ab [ i ] . set ( Integer . parseInt ( input . nextLine ( ) ) ) ;
      maxa = Math . max ( maxa , ab [ i ] . get ( 0 ) ) ;
    }
  }
  Arrays . sort ( ab , new Comparator < Tuple < Integer , Integer >> ( ) {
    @ Override public int compare ( Tuple < Integer , Integer > o1 , Tuple < Integer , Integer > o2 ) {
      return - o1 . get ( 1 ) ;
    }
  }
  ) ;
  for ( Tuple < Integer , Integer > katana : ab ) {
    if ( katana . get ( 1 ) > maxa ) {
      H -= katana . get ( 1 ) ;
      ans ++ ;
      if ( ( H <= 0 ) && ( ans <= 0 ) ) break ;
      else break ;
    }
  }
  if ( ( H <= 0 ) && ( ans <= 0 ) ) System . out . println ( ans ) ;
  else System . out . println ( ans + Math . ceil ( H / maxa ) ) ;
}
