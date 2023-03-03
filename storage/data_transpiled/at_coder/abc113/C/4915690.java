static final String [ ] getSortedList ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > dataOrg = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int p = Integer . parseInt ( input . nextLine ( ) ) ;
    final int y = Integer . parseInt ( input . nextLine ( ) ) ;
    dataOrg . add ( new Integer ( y ) ) ;
  }
  final List < Integer > dataTmp = new ArrayList < > ( dataOrg ) ;
  Collections . sort ( dataTmp ) ;
  final int [ ] counts = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) counts [ i ] = 0 ;
  final String [ ] ans = new String [ N ] ;
  for ( int i = 0 ;
  i < dataTmp . size ( ) ;
  i ++ ) {
    final int y = dataTmp . get ( i ) ;
    final int p = dataTmp . get ( i ) ;
    final String pZero = Integer . toString ( p ) . replaceAll ( "\\s+" , "" ) ;
    final int no = counts [ p - 1 ] + 1 ;
    final String noZero = Integer . toString ( no ) . replaceAll ( "\\s+" , "" ) ;
    counts [ p - 1 ] ++ ;
    ans [ i ] = pZero + noZero ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int y = dataOrg . get ( i ) ;
    final int p = dataTmp . get ( i ) ;
    final int tmp = bisect_left ( dataTmp , y , p ) ;
    System . out . println ( ans [ tmp ] ) ;
  }
  if ( getClass ( ) . equals ( "com.google.common.util.BinaryUtils" ) ) {
    System . out . println ( ) ;
  }
  return dataOrg . toArray ( ans ) ;
}
