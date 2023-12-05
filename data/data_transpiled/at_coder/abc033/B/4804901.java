@ InputFunction public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] numArray = new int [ N ] [ 2 ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    String s = input . nextLine ( ) ;
    String p = input . nextLine ( ) ;
    numArray [ n ] [ 0 ] = s ;
    numArray [ n ] [ 1 ] = Integer . parseInt ( p ) ;
  }
  Arrays . sort ( numArray , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  if ( numArray [ 0 ] [ 1 ] > Integer . MAX_VALUE / 2 ) {
    System . out . println ( numArray [ 0 ] [ 0 ] ) ;
  }
  else {
    System . out . println ( "atcoder" ) ;
  }
}
