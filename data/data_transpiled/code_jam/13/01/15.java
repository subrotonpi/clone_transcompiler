static final private boolean all_value ( final Iterator < String > it , final String [ ] values ) {
  return all ( ( Iterable ) it , values ) ;
}
boolean any_value ( Iterator < String > it , String [ ] values ) {
  return any ( ( Iterable ) it , values ) ;
}
String res ;
{
  return "Draw" ;
}
class Problem {
  int i ;
  String [ ] alines ;
  {
    assert ( alines . length == 4 ) ;
    arr = alines ;
    i = i ;
    a = access ( ) ;
    System . out . println ( alines + "\n" ) ;
    assert ( all_value ( ( Iterable ) alines , new String [ 4 ] ) ) ;
  }
  {
    int i ;
    String [ ] lines ;
    {
      lines = new String [ 4 ] ;
      for ( i = 0 ;
      i < 4 ;
      i ++ ) {
        lines [ i ] = in . nextLine ( ) . trim ( ) ;
      }
      return new Problem ( pcnt , lines ) ;
    }
  }
  {
    BufferedReader fin = new BufferedReader ( new FileReader ( System . getProperty ( "file.txt" ) ) ) ;
    PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "out.txt" ) ) ) ;
    int N = readInt ( fin ) ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      String p = readProblem ( fin , i + 1 ) ;
      fin . readLine ( ) ;
      Solver s = new Solver ( p ) ;
      s . solve ( ) ;
      fout . println ( p + "\n" ) ;
    }
  }
  {
    int i ;
    int j ;
    {
      assert ( i < 4 ) ;
      assert ( j < 4 ) ;
      char v = arr [ i ] . charAt ( j ) ;
      assert ( v == 'X' || v == 'O' || v == '.' || v == 'T' ) ;
      return v ;
    }
  }
  {
    int i ;
    int j ;
    int row ;
    int col ;
    {
      assert ( i < 4 ) ;
      char v = arr [ i ] . charAt ( j ) ;
      assert ( v == 'X' || v == 'O' || v == '.' || v == 'T' ) ;
      return true ;
    }
  }
  {
    int i ;
    int j ;
    int row ;
    int col ;
    while ( ( i = 0 ) < N ) {
      row = readInt ( fin ) ;
      j = readInt ( fin ) ;
    }
    if ( j < 4 ) {
      break ;
    }
    if ( i == 4 ) {
      break ;
    }
    return false