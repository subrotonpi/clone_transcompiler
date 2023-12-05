public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ls = new ArrayList < > ( ) ;
  for ( int num : input . nextLine ( ) . split ( " " ) ) ls . add ( new Integer ( num ) ) ;
  List < Integer > group1 = new ArrayList < > ( ) ;
  List < Integer > group2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ls . get ( i ) . intValue ( ) < ls . get ( i ) . intValue ( ) ) group1 . add ( ls . get ( i ) ) ;
    else group2 . add ( ls . get ( i ) ) ;
  }
  Collections . sort ( group1 , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  Collections . sort ( group2 , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int mx = 0 ;
  int tmp = 0 ;
  group1 . addAll ( group2 ) ;
  for ( Integer magic : group1 ) {
    tmp += magic ;
    if ( tmp > mx ) mx = tmp ;
    tmp -= magic ;
  }
  System . out . println ( mx ) ;
}
