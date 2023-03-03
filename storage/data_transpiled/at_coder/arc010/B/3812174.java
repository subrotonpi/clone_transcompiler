@ VisibleForTesting static void from ( LocalDate date , Duration duration ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> MD = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    MD . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  LocalDate d = LocalDate . of ( 2012 , 1 , 1 ) ;
  int overFlowHolidayCount = 0 ;
  int holidayCount = 0 ;
  int maxNum = 0 ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    if ( MD . contains ( Arrays . asList ( d . getMonthValue ( ) , d . getDayValue ( ) ) ) ) {
      MD . remove ( Arrays . asList ( d . getMonthValue ( ) , d . getDayValue ( ) ) ) ;
      overFlowHolidayCount ++ ;
    }
    if ( d . getDayOfWeek ( ) == 5 || d . getDayOfWeek ( ) == 6 ) {
      holidayCount ++ ;
    }
    else {
      maxNum = 0 ;
    }
    d . plusDays ( 1 ) ;
  }
  maxNum = Math . max ( maxNum , holidayCount ) ;
  System . out . println ( maxNum ) ;
}
