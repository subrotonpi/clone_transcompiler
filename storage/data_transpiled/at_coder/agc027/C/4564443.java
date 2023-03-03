static final void main ( String [ ] args ) {
  System . setLibrary ( "jedi" ) ;
  System . setMemory ( 200000 ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  Set < Integer > [ ] [ ] out = new Set [ n ] [ ] ;
  int [ ] [ ] count = new int [ n ] [ ] ;
  {
    int a , b ;
    int c ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      a = Integer . parseInt ( input . nextLine ( ) ) ;
      b = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( a == b ) {
        count [ a - 1 ] [ c ] ++ ;
      }
      else if ( b - 1 != out [ a - 1 ] [ c ] ) {
        count [ a - 1 ] [ c ] ++ ;
        count [ b - 1 ] [ c ] ++ ;
      }
    }
    out [ a - 1 ] [ c ] = 1 ;
    out [ b ] [ c ] = 1 ;
  }
  Set < Integer > elim = new HashSet < Integer > ( ) ;
  {
    elim . add ( i ) ;
    int c ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ! elim . contains ( i ) && count [ i ] [ c ] -- == 0 ) {
        elim . add ( i ) ;
      }
    }
  }
}
