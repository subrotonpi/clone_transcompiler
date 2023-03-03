@ InputFunction public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> tmpInfo = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tmpInfo . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Arrays . sort ( tmpInfo , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o2 . size ( ) - o1 . size ( ) ;
    }
  }
  ) ;
}
