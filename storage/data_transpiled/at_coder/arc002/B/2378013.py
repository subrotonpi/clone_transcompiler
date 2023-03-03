def main ( ) :
    import datetime
    import time
    from dateutil.parser.parse import parse_date
    sc = parse_date ( )
    date = sc.split ( '/' )
    year , month , day = [ int ( i ) for i in date [ 0 : 3 ] ]
    dt = datetime.datetime ( year , month - 1 , day )
    while year % month != 0 or ( year // month ) % day != 0 :
        dt += datetime.timedelta ( days = 1 )
        year = dt.year
        month = dt.month + 1
        day = dt.day
    month_str = str ( month ) if month > 9 else '0' + str ( month )
    day_str = str ( day ) if day > 9 else '0' + str ( day )
    print ( year , month_str , day_str )
