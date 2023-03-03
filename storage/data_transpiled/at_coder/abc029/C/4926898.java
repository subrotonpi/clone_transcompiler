static final int [ ] getChars ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] alp = {
    'a' , 'b' , 'c' }
    ;
    char [ ] res = new char [ N ] ;
    for ( char [ ] p : new char [ N ] ) {
      res [ p . length - 1 ] = '' ;
    }
    for ( char r : new char [ N ] ) {
      System . arraycopy ( alp , 0 , res , 0 , p . length ) ;
    }
    return res ;
  }
  