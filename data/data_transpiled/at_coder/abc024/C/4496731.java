public static int N = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> LR = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) LR . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > ST = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) ST . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > ST_tmp = new LinkedList < > ( ) ;
  int [ ] anss = new int [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int Li = LR . get ( i ) ;
    int Ri = ST . get ( i ) ;
    List < Integer > ST_next = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < ST_next . size ( ) ;
    j ++ ) {
      final int Sj = ST_tmp . get ( j ) ;
      anss [ j ] ++ ;
      if ( Sj < Tj ) {
        if ( Li <= Sj <= Ri ) S_next = Math . min ( ( Tj ) , Ri ) ;
        else S_next = Sj ;
      }
      else if ( Sj > Tj ) S_next = Sj ;
      if ( S_next != Tj ) ST_next . add ( new Integer ( j ) ) ;
    }
    ST_tmp . clear ( ) ;
  }
  for ( int ans : anss ) System . out . println ( ans ) ;
  return ans ;
}
