@ VisibleForTesting static void heapSort ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int z = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > persons = new ArrayList < > ( ) ;
  for ( int i = x ;
  i < x + y + z ;
  i ++ ) {
    persons . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  persons . sort ( new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer abc , Integer abc ) {
      return abc . intValue ( ) - abc . intValue ( ) ;
    }
  }
  ) ;
  int ans_g = Ints . saturatedCast ( persons . get ( persons . size ( ) - x ) ) ;
  int ans_s = Ints . saturatedCast ( persons . get ( persons . size ( ) - 1 ) ) ;
  int ans_c = Ints . saturatedCast ( persons . get ( y ) ) ;
  heapSort ( gold_pq ) ;
  heapSort ( silverpq ) ;
  int ans_f [ ] = new int [ 2 ] ;
  for ( int i = 0 ;
  i < ans_f . length ;
  i ++ ) {
    int a = persons . get ( i ) ;
    int b = b - a ;
    int np = b - c ;
    int rp = heapSort ( gold_pq , np ) ;
    ans_f [ i ] = np - rp ;
  }
  ans_f = Collections . unmodifiableList ( ans_f ) ;
  ans_b = Collections . unmodifiableList ( ans_b ) ;
  System . out . println ( ans_g + ans_s + ans_c + Math . max ( Arrays . asList ( ans_f ) , Arrays . asList ( ans_b ) ) ) ;
}
