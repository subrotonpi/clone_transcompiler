public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > AA = new ArrayList < > ( ) ;
  AA . add ( 0 ) ;
  AA . addAll ( A ) ;
  AA . add ( 0 ) ;
  List < Integer > Adif1 = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int x = Math . abs ( AA . get ( i ) - AA . get ( i - 1 ) ) ;
    Adif1 . add ( x ) ;
  }
  int s = Arrays . stream ( Adif1 . toArray ( ) ) . sum ( ) ;
  List < Integer > Adif2 = new ArrayList < > ( ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int x = Math . abs ( AA . get ( i ) - AA . get ( i - 2 ) ) ;
    Adif2 . add ( x ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( s + Adif2 . get ( i ) - Adif1 . get ( i ) - Adif1 . get ( i + 1 ) ) ;
  }
  return Adif2 . toArray ( ) ;
}
