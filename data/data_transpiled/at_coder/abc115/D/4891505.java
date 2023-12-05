public static final InputSupplier < IO > IO_GENERATOR = new InputSupplier < IO > ( ) {
  @ Override public IO getInput ( ) {
    return input ;
  }
  @ Override public int nPat ( int aN ) {
    return 2 * aN - 1 ;
  }
  @ Override public int nSize ( int aN ) {
    return 4 * ( 2 * ( aN - 1 ) ) - 3 ;
  }
  @ Override public int getSize ( int n , int x ) {
    if ( x == 0 ) {
      return 0 ;
    }
    else if ( x == 1 ) {
      return 0 ;
    }
    else if ( x < 1 + nSize ( n ) ) {
      return getSize ( n - 1 , x - 1 ) ;
    }
    else if ( x == 1 + nSize ( n ) ) {
      return nPat ( n ) ;
    }
    else if ( x == 1 + nSize ( n ) + 1 ) {
      return nPat ( n ) + 1 ;
    }
    else if ( x < 1 + nSize ( n ) + 1 + nSize ( n ) ) {
      int offset = 2 + nSize ( n ) ;
      return nPat ( n ) + 1 + getSize ( n - 1 , x - offset ) ;
    }
    else {
      return nPat ( n ) + 1 + nSize ( n ) ;
    }
  }
  @ Override public void main ( IO io ) {
    int n = Integer . parseInt ( io . toString ( ) ) ;
    int x = Integer . parseInt ( io . toString ( ) ) ;
    System . out . println ( main ( io ) ) ;
  }
}
