public static void read ( InputStream in , PrintStream out ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( in ) ) ;
  out = new PrintStream ( out ) ;
  int cases = Integer . parseInt ( br . readLine ( ) . substring ( 0 , br . readLine ( ) . length ( ) - 1 ) ) ;
  int [ ] [ ] x = adj2 [ 0 ] [ 1 ] ;
  int k = dp [ i - 1 ] [ 1 ] ;
  int q = find ( x , adj , dp [ i - 1 ] [ 1 ] ) ;
  if ( q < dp [ i - 1 ] [ 0 ] ) {
    k [ 0 ] = i ;
    dp [ i ] [ 1 ] = k ;
  }
  else {
    System . out . println ( "Case #" + ( case ) + ": " + dp [ n - 1 ] [ 0 ] + "\n" ) ;
  }
  for ( int i = 0 ;
  i < a1 . length ;
  i ++ ) {
    if ( a1 [ i ] [ 0 ] <= a2 [ i ] [ 0 ] ) {
      flag1 = false ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < a1 . length ;
  i ++ ) {
    if ( a1 [ i ] [ 0 ] <= a2 [ i ] [ 0 ] ) {
      flag2 = false ;
      break ;
    }
  }
  int [ ] [ ] x = new int [ n ] [ 1 ] ;
  int col = 0 ;
  Comparator < String > customComparator = new Comparator < String > ( ) {
    @ Override public int compare ( String host1 , String host2 ) {
      if ( host1 . length ( ) == host2 . length ( ) ) return host1 . compareTo ( host2 ) ;
      else if ( host1 . length ( ) < host2 . length ( ) ) return 1 ;
      else return - 1 ;
    }
  }
  ;
  Comparator < String > cc2 = new Comparator < String > ( ) {
    @ Override public int compare ( String o1 , String o2 ) {
      return customComparator . compare ( o1 . charAt ( 1 ) , o2 . charAt ( 1 ) ) ;
    }
  }
  ;
  int [ ] [ ] [ ] arr = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = br . readLine ( ) . substring ( 0 , s . length ( ) - 1 ) . split ( " " ) ;
    int n = Integer . parseInt ( s [ 0 ] ) ;
    int k