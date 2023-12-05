static void print ( ) {
  final String [ ] lines = Arrays . stream ( System . in ) . map ( l -> l . trim ( ) ) . toArray ( String [ ] :: new ) ;
  final int T = Integer . parseInt ( lines [ 0 ] ) ;
  int i = 1 ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int Ac = Integer . parseInt ( lines [ i ] ) ;
    final int Aj = Integer . parseInt ( lines [ i ] ) ;
    final int [ ] [ ] A = {
      Ac , Aj }
      ;
      i ++ ;
      final int [ ] [ ] spans = new int [ 2 ] [ 2 ] ;
      final int [ ] T = {
        720 , 720 }
        ;
        for ( int k = 0 ;
        k < 2 ;
        k ++ ) {
          for ( int j = 0 ;
          j < A [ k ] ;
          j ++ ) {
            final int a = Integer . parseInt ( lines [ i ] ) ;
            final int b = Integer . parseInt ( lines [ i ] ) ;
            i ++ ;
            spans [ k ] [ j ] = a ;
            spans [ k ] [ j ] = b ;
            T [ k ] -= b - a ;
          }
        }
        Arrays . sort ( spans ) ;
        final int [ ] first = spans [ 0 ] ;
        spans [ 0 ] [ 0 ] = first [ 0 ] + 24 * 60 ;
        spans [ 1 ] [ 0 ] = first [ 1 ] + 24 * 60 ;
        spans [ 2 ] [ 0 ] = first [ 2 ] ;
        int sol = 0 ;
        final int [ ] [ ] fillable = new int [ 2 ] [ 2 ] ;
        for ( int j = 0 ;
        j < Ac + Aj ;
        j ++ ) {
          if ( spans [ j ] [ 2 ] == spans [ j + 1 ] [ 2 ] ) {
            fillable [ spans [ j ] [ 2 ] ] += Arrays . copyOfRange ( spans [ j + 1 ] [ 0 ] , spans [ j + 1 ] [ 1 ] - spans [ j ] [ 1 ] ) ;
            sol += 2 ;
          }
          else {
            sol ++ ;
          }
        }
        Arrays . sort ( fillable ) ;
        Arrays . sort ( fillable ) ;
        for ( int k = 0 ;
        k < 2 ;
        k ++ ) {
          for ( int j : fillable [ k ] ) {
            if ( j <= T [ k ] ) {
              T [ k ] -= j ;
              sol -= 2 ;
            }
            else {
              break ;
            }
          }
        }
        System . out