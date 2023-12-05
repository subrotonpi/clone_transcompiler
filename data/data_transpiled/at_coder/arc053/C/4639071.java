static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > AB1 = new ArrayList < > ( ) , AB2 = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( a < b ) {
        AB1 . add ( new Integer ( a ) ) ;
      }
      else {
        AB2 . add ( new Integer ( a ) ) ;
      }
    }
    Collections . sort ( AB1 ) ;
    Collections . sort ( AB2 , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer a , Integer b ) {
        return a - b ;
      }
    }
    ) ;
  }
}
