public static void print ( int n ) {
  List < Integer > AB1 = new ArrayList < > ( ) , AB2 = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a < b ) {
      AB1 . add ( new Integer ( a ) ) ;
    }
    else {
      AB2 . add ( new Integer ( a ) ) ;
    }
  }
  Collections . sort ( AB1 ) ;
  Collections . sort ( AB2 , new Comparator < Integer > ( ) {
    public int compare ( Integer a , Integer b ) {
      return a - b ;
    }
  }
  ) ;
  int ans = 0 , temp = 0 ;
  for ( int a = 0 ;
  a < AB1 . size ( ) ;
  a ++ ) {
    int b = AB2 . get ( a ) ;
    temp += a ;
    ans = Math . max ( ans , temp ) ;
    temp -= b ;
  }
  System . out . println ( ans ) ;
}
