public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > zahyo = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) {
    zahyo . add ( 0 ) ;
  }
  Collections . sort ( sa , Collections . reverseOrder ( ) ) ;
  int [ ] sa = new int [ N - 1 ] ;
  sa [ 0 ] = 1 ;
  return sa ;
}
