public static String aBBs ( int N , int M , String A ) {
  Set < Integer > writtenThread = new HashSet < Integer > ( ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int a : new ArrayList < Integer > ( A ) ) {
    if ( ! writtenThread . contains ( a ) ) {
      writtenThread . add ( a ) ;
      ans . append ( a ) ;
    }
  }
  Set < Integer > remainThread = new HashSet < Integer > ( ) ;
  remainThread . addAll ( writtenThread ) ;
  ans . deleteCharAt ( remainThread . size ( ) ) ;
  ans = ans . toString ( ) ;
  return ans ;
}
