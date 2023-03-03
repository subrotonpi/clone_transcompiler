@ VisibleForTesting static void from ( String input ) {
  final int [ ] A = new int [ N ] ;
  final int [ ] B = new int [ N ] ;
  final int [ ] C = new int [ N ] ;
  final int N = Integer . parseInt ( input ) ;
  Arrays . fill ( a , 0 ) ;
  Arrays . fill ( b , 0 ) ;
  Arrays . fill ( c , 0 ) ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    A [ a [ k ] ] ++ ;
    B [ b [ k ] ] ++ ;
    C [ c [ k ] ] ++ ;
  }
  final Set < Integer > Aset = new TreeSet < Integer > ( ) ;
  final Set < Integer > Bset = new TreeSet < Integer > ( ) ;
  final Set < Integer > Cset = new TreeSet < Integer > ( ) ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    Aset . add ( a [ k ] ) ;
    Bset . add ( b [ k ] ) ;
    Cset . add ( c [ k ] ) ;
  }
  int cnt = 0 ;
  int indexA = 0 ;
  int indexC = 0 ;
  a = 0 ;
  c = N ;
  for ( int b : Bset ) {
    boolean flagA = false ;
    boolean flagC = false ;
    if ( a < N ) {
      for ( int k = indexA ;
      k < Aset . size ( ) ;
      k ++ ) {
        if ( Aset . get ( k ) < b ) {
          a += A [ Aset . get ( k ) ] ;
        }
        else {
          indexA = k ;
          flagA = true ;
          break ;
        }
      }
    }
    for ( int k = indexC ;
    k < Cset . size ( ) ;
    k ++ ) {
      if ( Cset . get ( k ) <= b ) {
        c -= C [ Cset . get ( k ) ] ;
      }
      else {
        indexC = k ;
        flagC = true ;
        break ;
      }
    }
    if ( flagA == false ) {
      a = N ;
    }
    if ( flagC == false ) {
      break ;
    }
    cnt += a * c * B [ b ] ;
  }
  System . out . println ( cnt ) ;
}
