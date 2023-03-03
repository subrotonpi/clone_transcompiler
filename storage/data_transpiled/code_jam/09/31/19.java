static class Gcjt {
  class Testcase {
    private int num ;
    private Gcjt gcjt ;
    public Testcase ( int num , Gcjt gcjt ) {
      this . num = num ;
      this . gcjt = gcjt ;
    }
    public void answer ( String answer ) {
      gcjt . outs . println ( "Case #" + num + ": " + ans ) ;
    }
    public void ws ( String string ) {
      gcjt . outs . println ( string ) ;
    }
    public String rl ( ) {
      return gcjt . ins . readLine ( ) ;
    }
    public int ri ( ) {
      return ( Integer . parseInt ( s ) ) ;
    }
    public void enter ( ) {
      String file = input . readLine ( ) ;
      fin = file + ".in" ;
      fout = file + ".out" ;
    }
    public void enter ( ) {
      ins = new BufferedReader ( new FileReader ( fin ) ) ;
      outs = new PrintWriter ( new FileWriter ( fout ) ) ;
    }
    public void exit ( ) {
      ins . close ( ) ;
      outs . close ( ) ;
    }
    public void test ( int num ) {
      synchronized ( gcjt ) {
        if ( num < 1 ) num = Integer . parseInt ( ins . readLine ( ) ) ;
        for ( int t = 0 ;
        t < num ;
        t ++ ) {
          new Gcjt ( ) . test ( t + 1 , this ) ;
        }
      }
    }
    public Object [ ] array ( int ... dim ) {
      if ( dim . length == 1 ) return new Object [ dim [ 0 ] ] ;
      else return Arrays . copyOf ( new Object [ dim . length ] , dim [ 0 ] ) ;
    }
  }
  