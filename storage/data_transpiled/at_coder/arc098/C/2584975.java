public static void addList ( List < Integer > buf , List < List < Integer >> newLists , List < Integer > removals ) {
  int l = buf . size ( ) ;
  if ( l >= k ) {
    List < Integer > sbf = new ArrayList < Integer > ( buf ) ;
    Collections . addAll ( newLists , sbf , 0 , l - k + 1 ) ;
    newLists . add ( buf ) ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aaa = Lists . newArrayList ( ) ;
  List < Integer > srt = new ArrayList < Integer > ( ) ;
  srt . add ( aaa ) ;
  List < List < Integer >> lists = new ArrayList < List < Integer >> ( ) ;
  lists . add ( aaa ) ;
  double ans = Double . MAX_VALUE ;
  for ( int a : srt ) {
    newLists . clear ( ) ;
    removals . add ( a ) ;
    for ( List < Integer > lst : lists ) {
      buf . clear ( ) ;
      for ( int b : lst ) {
        if ( a > b ) {
          addList ( buf , newLists , removals ) ;
          buf . clear ( ) ;
        }
        else {
          buf . add ( b ) ;
        }
      }
      addList ( buf , newLists , removals ) ;
    }
    if ( removals . size ( ) < q ) break ;
  }
  Collections . sort ( lists ) ;
  ans = ans ;
}
