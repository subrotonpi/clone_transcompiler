public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] p = new int [ N ] [ 2 ] ;
  int [ ] [ ] n = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int aNum = Integer . parseInt ( input . nextLine ( ) ) ;
    int bNum = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( aNum >= bNum ) {
      p [ i ] [ 0 ] = aNum ;
      p [ i ] [ 1 ] = bNum ;
    }
    else {
      n [ i ] [ 0 ] = aNum ;
      n [ i ] [ 1 ] = bNum ;
    }
  }
  /* get first */
  int first = p [ 0 ] [ 0 ] ;
  /* get second */
  Collections . sort ( p , new Comparator < Integer > ( ) {
    public int compare ( Integer first , Integer second ) {
      return second ;
    }
  }
  ) ;
  Collections . sort ( n , new Comparator < Integer > ( ) {
    public int compare ( Integer first , Integer second ) {
      return first ;
    }
  }
  ) ;
  return first ;
}
