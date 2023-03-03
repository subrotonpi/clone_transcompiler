public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < ArrayList < Integer >> timetable = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String start = input . replaceAll ( " " , "" ) ;
    String end = input . replaceAll ( "-" , "" ) ;
    start = Integer . parseInt ( start ) ;
    if ( start % 10 < 5 ) {
      start -= start % 10 ;
    }
    else {
      start -= start % 10 - 5 ;
    }
    end = Integer . parseInt ( end ) ;
    if ( 0 < end % 10 <= 5 ) {
      end += 5 - end % 10 ;
    }
    else if ( 5 < end % 10 ) {
      end += 10 - end % 10 ;
      if ( end % 100 == 60 ) {
        end += 40 ;
      }
    }
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
    timetable . add ( new ArrayList < Integer > ( ) ) ;
  }
  Collections . sort (