public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  int unum = Collections . min ( a ) ;
  int vnum = Collections . max ( a ) ;
  int u = a . indexOf ( unum ) ;
  int v = a . indexOf ( vnum ) ;
  boolean exist = false ;
  if ( vnum - unum == 1 ) {
    if ( u + 1 <= vnum && vnum <= u + v / 2 ) {
      exist = true ;
    }
  }
  else if ( vnum == unum ) {
    if ( vnum == n - 1 || vnum <= n / 2 ) {
      exist = true ;
    }
  }
  System . out . println ( exist ? "Yes" : "No" ) ;
}
