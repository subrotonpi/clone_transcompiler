static final double [ ] readNumbers ( ) {
  final int n = input . nextInt ( ) ;
  final double [ ] a ;
  class KyoPro {
    @ Override public List < Integer > readNumbers ( ) {
      return Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    @ Override public String makeStringFromNumbers ( int [ ] a ) {
      if ( a . length == 0 ) {
        return null ;
      }
      String s = a [ 0 ] ;
      for ( int i = 1 ;
      i < a . length ;
      i ++ ) {
        s += ' ' + a [ i ] ;
      }
      return s ;
    }
  }
  public void main ( String [ ] args ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    a = KyoPro . readNumbers ( ) ;
    Arrays . sort ( a ) ;
    Arrays . reverse ( a ) ;
    int count = 0 ;
    double ans = 0 ;
    for ( int i = 0 ;
    i < 3 * n ;
    i ++ ) {
      if ( ( i % 2 == 1 ) && ( a [ i ] == 0 ) ) {
        ans += a [ i ] ;
        count ++ ;
      }
      if ( ( count == n ) && ( a [ i ] == 0 ) ) {
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
}
