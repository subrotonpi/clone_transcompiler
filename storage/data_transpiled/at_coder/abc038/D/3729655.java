static final int [ ] [ ] find ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> WH = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    WH . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( WH , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  return ANS . toArray ( new int [ 0 ] [ 0 ] ) ;
}
