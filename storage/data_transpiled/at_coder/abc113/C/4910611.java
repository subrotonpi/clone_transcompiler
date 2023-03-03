public static int N ( String input ) {
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> py = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    py . add ( new LinkedList < > ( ) ) ;
    py . get ( i ) . add ( i ) ;
  }
  Collections . sort ( py , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      int ct = 1 ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        if ( i == 0 ) {
          ct = 1 ;
          number . add ( new Integer ( Integer . toString ( py . get ( i ) . intValue ( ) ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " " , "" ) . replaceAll ( " "