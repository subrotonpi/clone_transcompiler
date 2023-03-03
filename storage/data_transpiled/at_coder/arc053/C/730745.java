static final int [ ] [ ] getMagicNumbers ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] ls = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ls [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  List < MagicNumbers > group1 = new ArrayList < > ( ) ;
  List < MagicNumbers > group2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ls [ i ] [ 0 ] < ls [ i ] [ 1 ] ) group1 . add ( ls [ i ] ) ;
    else group2 . add ( ls [ i ] ) ;
  }
  Collections . sort ( group1 , new Comparator < MagicNumbers > ( ) {
    @ Override public int compare ( MagicNumbers o1 , MagicNumbers o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  Collections . sort ( group2 , new Comparator < MagicNumbers > ( ) {
    @ Override public int compare ( MagicNumbers o1 , MagicNumbers o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int mx = 0 ;
  int tmp = 0 ;
  group1 . addAll ( group2 ) ;
  for ( MagicNumbers magic : group1 ) {
    tmp += magic . getMagicNumbers ( ) ;
    if ( tmp > mx ) mx = tmp ;
    tmp -= magic . getMagicNumbers ( ) ;
  }
  System . out . println ( mx ) ;
  return group1 ;
}
