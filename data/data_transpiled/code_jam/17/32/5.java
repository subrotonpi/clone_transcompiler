static final void main ( String [ ] args ) {
  final ArgumentParser ap = new ArgumentParser ( args ) ;
  ap . parse ( ) ;
  final List < String > toks = ap . getArgs ( ) ;
  toks . clear ( ) ;
  toks . add ( "input" ) ;
  Collections . reverse ( toks ) ;
  final int T = Integer . parseInt ( toks . remove ( ) ) ;
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    final int Ac = Integer . parseInt ( toks . remove ( ) ) ;
    final int Aj = Integer . parseInt ( toks . remove ( ) ) ;
    final int totC = 720 ;
    final int totJ = 720 ;
    final String [ ] [ ] A = new String [ A . length ] [ A [ 0 ] . length ] ;
    for ( int i : xrange ( Ac ) ) {
      final int C = Integer . parseInt ( toks . remove ( ) ) ;
      final int D = Integer . parseInt ( toks . remove ( ) ) ;
      A [ i ] = new String [ C ] ;
      A [ i ] [ D ] = "C" ;
      totC -= D - C ;
    }
    for ( int i : xrange ( Aj ) ) {
      final int C = Integer . parseInt ( toks . remove ( ) ) ;
      final int D = Integer . parseInt ( toks . remove ( ) ) ;
      A [ i ] [ C ] = "J" ;
      A [ i ] [ D ] = "J" ;
      totJ -= D - C ;
    }
    int exch = 0 ;
    Arrays . sort ( A , new Comparator < String > ( ) {
      public int compare ( String o1 , String o2 ) {
        final int [ ] Cs = new int [ A . length ] ;
        final int [ ] Js = new int [ A . length ] ;
        for ( int i : xrange ( 0 , A . length ) ) {
          final int prev = i != 0 ? i - 1 : A . length - 1 ;
          if ( A [ prev ] [ 2 ] != A [ i ] [ 2 ] ) {
            exch ++ ;
            continue ;
          }
          final int l = A [ i ] [ 0 ] - A [ prev ] [ 1 ] ;
          if ( l < 0 ) l += 1440 ;
          if ( A [ prev ] [ 2 ] == "C" ) Cs [ i ] = l ;
          else Js [ i ] = l ;
        }
        return 0 ;
      }
    }
  }
  ) ;
  for ( int i = 0 ;
  i < A