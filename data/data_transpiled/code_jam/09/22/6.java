public static String nextNumber ( String [ ] digits ) {
  if ( digits . length == 1 ) {
    return null ;
  }
  if ( digits . length == 2 ) {
    return ( digits [ 1 ] . compareTo ( digits [ 0 ] ) > 0 ) ? ( digits [ 1 ] . compareTo ( digits [ 0 ] ) ) : null ;
  }
  String rearrange = nextNumber ( digits [ 1 ] ) ;
  if ( rearrange != null ) {
    digits [ 1 ] = rearrange ;
    return digits [ 0 ] ;
  }
  List < String > larger = Arrays . asList ( digits ) ;
  if ( larger . size ( ) > 0 ) {
    String minLarger = Collections . min ( larger ) ;
    List < String > tailDigits = delone ( digits , 0 , minLarger ) ;
    Collections . sort ( tailDigits ) ;
    tailDigits . add ( 0 , minLarger ) ;
    return tailDigits . toString ( ) ;
  }
  /* Remove first larger number */
  for ( int i = 0 ;
  i < tailDigits . size ( ) ;
  i ++ ) {
    if ( tailDigits . get ( i ) . equals ( digits [ i ] ) ) {
      tailDigits . remove ( i ) ;
      break ;
    }
  }
  File file = new File ( "B-large.in" ) ;
  FileWriter o = new FileWriter ( file ) ;
  int cases = Integer . parseInt ( file . getAbsolutePath ( ) ) ;
  for ( int i = 1 ;
  i <= cases ;
  i ++ ) {
    o . write ( "Case #" + i + ": " ) ;
    String strn = file . getAbsolutePath ( ) . trim ( ) ;
    int [ ] digits = new int [ strn . length ( ) ] ;
    for ( int j = 0 ;
    j < digits . length ;
    j ++ ) {
      digits [ j ] = Integer . parseInt ( strn . substring ( j , j + 1 ) ) ;
    }
    String nextDigits = nextNumber ( digits ) ;
    if ( nextDigits == null ) {
      int leader = Collections . min ( Arrays . asList ( digits ) ) ;
      digits = delone ( digits , leader ) ;
      Collections . sort ( digits ) ;
      nextDigits = new int [ ] {
        leader , 0 }
        ;
      }
      String nextNumber = StringUtils . toString ( nextDigits ) ;
      o . write ( nextNumber + "\n" ) ;
    }
    o . close ( ) ;
    return null ;
  }
  