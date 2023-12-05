public static void main ( String [ ] args ) throws Exception {
  final Scanner input = new Scanner ( System . in ) ;
  final String s = input . next ( ) ;
  final String t = input . next ( ) ;
  final Point [ ] snum = new Point [ s . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' ) {
      snum [ i ] = new Point ( snum [ snum . length - 1 ] . x + 1 , snum [ snum . length - 1 ] . y ) ;
    }
    else {
      snum [ i ] = new Point ( snum [ snum . length - 1 ] . x , snum [ snum . length - 1 ] . y + 1 ) ;
    }
  }
  final Point [ ] tnum = new Point [ t . length ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    if ( t . charAt ( i ) == 'A' ) {
      tnum [ i ] = new Point ( tnum [ tnum . length - 1 ] . x + 1 , tnum [ tnum . length - 1 ] . y ) ;
    }
    else {
      tnum [ i ] = new Point ( tnum [ tnum . length - 1 ] . x , tnum [ tnum . length - 1 ] . y + 1 ) ;
    }
  }
  final int q = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( input . next ( ) ) ;
    int b = Integer . parseInt ( input . next ( ) ) ;
    int c = Integer . parseInt ( input . next ( ) ) ;
    int d = Integer . parseInt ( input . next ( ) ) ;
    int sa = snum [ b ] . x - snum [ a - 1 ] . x ;
    int sb = snum [ b ] . y - snum [ a - 1 ] . y ;
    int ta = tnum [ d ] . x - tnum [ c - 1 ] . x ;
    int tb = tnum [ d ] . y - tnum [ c - 1 ] . y ;
    int b1 = sb + sa * 2 ;
    b1 += Math . max ( tb - b1 , 0 ) / 3 * 3 + 3 ;
    int a1 = ( b1 - tb ) * 2 ;
    if ( Math . abs ( a1