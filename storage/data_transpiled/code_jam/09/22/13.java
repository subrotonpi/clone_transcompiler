public static String solve ( String fileprefix ) throws IOException {
  String filepath = "" ;
  String filepathname = filepath + fileprefix ;
  String infilename = filepathname + ".in" ;
  String outfilename = filepathname + ".out" ;
  String [ ] lines = Files . readAllLines ( Paths . get ( infilename ) , Charset . defaultCharset ( ) ) . toArray ( String [ ] :: new ) ;
  PrintStream out = new PrintStream ( outfilename ) ;
  int linenum = 1 ;
  int cases = Integer . parseInt ( lines [ 0 ] ) ;
  {
    int [ ] D = new int [ 9 ] ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      D [ i ] = - 1 ;
    }
    for ( char ch : lines [ linenum ] . toCharArray ( ) ) {
      int i = Integer . parseInt ( ch ) ;
      if ( i != 0 ) {
        D [ Integer . parseInt ( ch ) ] ++ ;
      }
    }
    int digits = lines [ linenum ] . length ( ) ;
    String biggest = "" ;
    for ( int i = 9 ;
    i > 0 ;
    i -- ) {
      biggest += Integer . toString ( i ) * D [ i ] ;
    }
    biggest += "0" * ( digits - biggest . length ( ) ) ;
    if ( lines [ linenum ] . equals ( biggest ) ) {
      String smallest = "" ;
      for ( int i = 1 ;
      i <= 10 ;
      i ++ ) {
        smallest += Integer . toString ( i ) * D [ i ] ;
      }
      smallest = smallest . substring ( 0 , smallest . length ( ) - ( "0" * ( digits + 1 - smallest . length ( ) ) ) ) + smallest . substring ( 1 ) ;
      return smallest ;
    }
    else {
      int cur = Integer . parseInt ( lines [ linenum - 1 ] ) ;
      int [ ] rest = new int [ digits ] ;
      int max = cur ;
      for ( int i = digits - 2 ;
      i >= 0 ;
      i -- ) {
        cur = Integer . parseInt ( lines [ linenum ] ) ;
        if ( cur >= max ) {
          rest [ i ] = cur ;
          max = cur ;
        }
        else {
          Arrays . sort ( rest ) ;
          for ( int j = 0 ;
          j < rest . length ;
          j ++ ) {
            if ( rest [ j ] > cur ) {
              int switched = j ;
              break ;
            }
          }
          String r = lines [ linenum ] . substring ( 0 , i ) + rest [ switched ] ;
          for ( int l = 0 ;
          l < rest