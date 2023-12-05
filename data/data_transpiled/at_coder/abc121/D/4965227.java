static final void main ( String [ ] args ) {
  final IntFunction reatInt = new IntFunction ( ) {
    public int asInt ( ) {
      return Integer . parseInt ( args [ 0 ] ) ;
    }
  }
  ;
  IntFunction reatIntN = new IntFunction ( ) {
    public int asInt ( ) {
      return Integer . parseInt ( args [ 1 ] ) ;
    }
  }
  ;
  int a = reatIntN . asInt ( ) ;
  b ++ ;
  a = ( a / 2 ) % 2 ^ ( ( a - 1 ) * ( a % 2 ) ) ;
  b = ( b / 2 ) % 2 ;
  int ret = a ^ b ;
  System . out . println ( ret ) ;
}
