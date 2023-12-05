static final long time = System . currentTimeMillis ( ) , System . err = new java . util . logging . ConsoleHandler ( ) {
  @ Override public int getLineNumber ( ) {
    return Thread . currentThread ( ) . getLine ( ) ;
  }
}
;
print = new PrintStream ( System . err , true , "line #" + getLineNumber ( ) + ":" , true ) ;
final int [ ] [ ] data = new int [ n ] [ ] ;
{
  int n = data [ 0 ] . length ;
  int p = data [ 0 ] . length ;
  int r = data [ 0 ] [ 0 ] . length ;
  int [ ] [ ] q = data [ 0 ] [ 0 ] [ 0 ] ;
  for ( int qi : q ) {
    Arrays . sort ( q ) ;
  }
  int [ ] indexes = new int [ n ] ;
  int ret = 0 ;
  for ( int i = 0 ;
  i < p ;
  ++ i ) {
    double servings = q [ 0 ] [ i ] / r [ 0 ] ;
    double bnLow = Math . ceil ( servings / 1.1 ) ;
    double bnHi = Math . floor ( servings / .9 ) ;
    if ( bnLow > bnHi ) continue ;
    for ( int j = 1 ;
    j < n ;
    ++ j ) {
      int ij = indexes [ j ] ;
      if ( ij >= p ) return ret ;
      while ( q [ j ] [ ij ] < ( .9 * bnLow * r [ j ] ) ) {
        ++ ij ;
        if ( ij >= p ) return ret ;
        indexes [ j ] = ij ;
        if ( q [ j ] [ ij ] <= ( 1.1 * bnHi * r [ j ] ) ) {
          double lservs = q [ j ] [ ij ] / r [ j ] ;
          bnLow = Math . max ( bnLow , Math . ceil ( lservs / 1.1 ) ) ;
          bnHi = Math . min ( bnHi , Math . floor ( lservs / .9 ) ) ;
          indexes [ j ] = ij + 1 ;
        }
        else break ;
      }
      else {
        ++ ret ;
      }
    }
  }
  @ Override public int [ ] [ ] readCase ( ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int p = Integer . parseInt ( input ( ) ) ;
    int r = Integer . parseInt ( input ( ) ) ;
    return new int [ ] [ ] {
      n , p , r , new int [ ] {
        Integer . parseInt ( input ( ) ) }
      }
      ;
      