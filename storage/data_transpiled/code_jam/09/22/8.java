static final Scanner input = new Scanner ( System . in ) {
  @ Override public void scan ( int test , int n ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    int n = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    String [ ] a = new String [ n ] ;
    String s = "" ;
    String ans = "" ;
    boolean found = false ;
    int [ ] counts = new int [ 10 ] ;
    int [ ] used = new int [ 10 ] ;
    {
      int i ;
      int j ;
      int i ;
      boolean greater = false ;
      for ( i = 0 ;
      i < n ;
      i ++ ) {
        if ( found ) return ;
        if ( pos == s . length ( ) ) {
          if ( greater ) {
            found = true ;
            ans = new String ( a ) ;
          }
          return ;
        }
        if ( greater ) {
          i = 0 ;
          while ( used [ i ] == counts [ i ] ) i ++ ;
          used [ i ] ++ ;
          a [ pos ] = Integer . toString ( i ) ;
          bt ( pos + 1 , greater ) ;
          used [ i ] -- ;
        }
        else {
          i = Integer . parseInt ( s . charAt ( pos ) ) ;
          used [ i ] ++ ;
          a [ pos ] = Integer . toString ( i ) ;
          bt ( pos + 1 , false ) ;
          used [ i ] -- ;
          i ++ ;
          while ( i < 10 && used [ i ] == counts [ i ] ) i ++ ;
          if ( i < 10 ) {
            used [ i ] ++ ;
            a [ pos ] = Integer . toString ( i ) ;
            bt ( pos + 1 , true ) ;
            used [ i ] -- ;
          }
        }
      }
    }
  }
}
;
for ( int test = 0 ;
test < n ;
test ++ ) {
  s = br . readLine ( ) . trim ( ) ;
  a = new String [ n ] ;
  counts = new int [ 10 ] ;
  used = new int [ 10 ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = "" ;
  }
  found = false ;
  bt ( 0 , false ) ;
  String result ;
  int i ;
  result = ans . substring ( 0 , i ) ;
  if ( found ) {
    result = ans . substring ( i + 1 ) ;
  }
  else {
    result = ans . substring ( i + 1 ) ;
  }
  ans = result ;
}
System . out . println ( "Case #" + ( test + 1 ) + " :