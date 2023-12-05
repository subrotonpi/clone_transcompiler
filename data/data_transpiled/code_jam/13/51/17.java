private static long GetAns ( List < Integer > Source , List < Integer > Curr , int B ) {
  if ( Ints . checkedCast ( Curr ) - Ints . checkedCast ( Source ) > B ) return 0 ;
  long ans = - Ints . checkedCast ( Curr ) + Ints . checkedCast ( Source ) ;
  int m = Ints . checkedCast ( Curr ) ;
  int c = Curr . stream ( ) . filter ( i -> i >= m ) . count ( ) ;
  for ( int i = 0 ;
  i < Curr . size ( ) ;
  i ++ ) {
    if ( Curr . get ( i ) == m ) ans += ( Curr . get ( i ) - Source . get ( i ) ) * 36 / c ;
  }
  return ans ;
  /* solve the number */
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int CurrB = B ;
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( i ) ;
  }
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 37 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 ) ;
  list . add ( 0 )