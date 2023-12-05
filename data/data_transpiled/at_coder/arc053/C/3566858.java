static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > magic = Arrays . asList ( Integer . parseInt ( input ( ) ) ) ;
  List < Integer > plus = new ArrayList < > ( ) ;
  List < Integer > minus = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < magic . size ( ) ;
  i ++ ) {
    if ( magic . get ( i ) . intValue ( ) > magic . get ( i ) . intValue ( ) ) {
      plus . add ( magic . get ( i ) ) ;
    }
    else {
      minus . add ( magic . get ( i ) ) ;
    }
  }
  Collections . sort ( plus , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  Collections . sort ( minus , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int temp = 0 ;
  int ans = 0 ;
  for ( Integer i : minus ) {
    temp += i . intValue ( ) ;
    ans = Math . max ( ans , temp ) ;
    temp -= i . intValue ( ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
