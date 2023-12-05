@ functools . public static void solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( "output.txt" ) ) ;
  Function < String , String > input = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return inf . readLine ( ) . trim ( ) ;
    }
  }
  ;
  print = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return ouf . apply ( input ) ;
    }
  }
  ;
  int M = 1000002013 ;
  {
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int m = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] o = new int [ m ] , e = new int [ m ] , p = new int [ m ] ;
    List < Pair < Integer , Integer >> ev = new ArrayList < Pair < Integer , Integer >> ( ) ;
    int ans0 = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int to = Integer . parseInt ( input . readLine ( ) ) ;
      int te = Integer . parseInt ( input . readLine ( ) ) ;
      int tp = Integer . parseInt ( input . readLine ( ) ) ;
      to -- ;
      te -- ;
      o [ i ] = to ;
      e [ i ] = te ;
      p [ i ] = tp ;
      ev . add ( new Pair < Integer , Integer > ( 1 , to , tp ) ) ;
      ev . add ( new Pair < Integer , Integer > ( - 1 , te , tp ) ) ;
      ans0 += dist ( n , to , te ) * tp ;
    }
    Collections . sort ( ev , new Comparator < Pair < Integer , Integer >> ( ) {
      @ Override public int compare ( Pair < Integer , Integer > t , Pair < Integer , Integer > o1 ) {
        return t . second - t . first ;
      }
    }
    ) ;
    List < Integer > st = new ArrayList < Integer > ( ) ;
    int ans1 = 0 ;
    for ( Pair < Integer , Integer > t : ev ) {
      int tt = t . second ;
      int ti = t . first ;
      tp = t . second ;
      if ( tt == 1 ) {
        st . add ( t . second ) ;
      }
      else {
        while ( tp > 0 ) {
          int tpp = st . get ( st . size ( ) - 1 ) . second