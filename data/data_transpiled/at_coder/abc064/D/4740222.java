@ VisibleForTesting static String readString ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  Deque < String > dq = new LinkedList < > ( ) ;
  StringBuilder ans = new StringBuilder ( Collections . nCopies ( N , S ) ) ;
  for ( String s : S . split ( " " ) ) {
    if ( dq . isEmpty ( ) ) {
      dq . addFirst ( s ) ;
    }
    else {
      if ( dq . peek ( ) == '(' && s . equals ( ')' ) ) {
        dq . removeLast ( ) ;
      }
      else {
        dq . addLast ( s ) ;
      }
    }
  }
  while ( dq . size ( ) > 0 ) {
    String value = dq . poll ( ) ;
    if ( value . equals ( ')' ) {
      ans . appendFirst ( "(" ) ;
    }
    else {
      ans . appendFirst ( value ) ;
    }
  }
  return ans . toString ( ) ;
}
