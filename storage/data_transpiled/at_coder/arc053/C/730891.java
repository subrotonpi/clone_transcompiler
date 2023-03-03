public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > t1 = new ArrayList < > ( ) ;
  ArrayList < Integer > t2 = new ArrayList < > ( ) ;
  long ts = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( a >= b ) {
      t2 . add ( a ) ;
    }
    else {
      t1 . add ( a ) ;
    }
  }
  Collections . sort ( t2 , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o2 - o1 ;
    }
  }
  ) ;
  Collections . sort ( t1 , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ;
  List < Integer > t = t1 . stream ( ) . map ( e -> e ) . collect ( Collectors . toList ( ) ) ;
  long tn = 0 ;
  for ( Integer e : t ) {
    tn += e . longValue ( ) ;
    ts = Math . max ( ts , tn ) ;
    tn -= e . longValue ( ) ;
  }
  System . out . println ( ts ) ;
}
