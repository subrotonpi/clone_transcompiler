def main ( ) :
    import sys
    for date in sys.stdin :
        year , month , day = [ int ( i ) for i in date.split ( '/' ) ]
        if year < 2019 :
            print ( 'Heisei' )
        elif year == 2019 and month <= 4 :
            print ( 'Heisei' )
        else :
            print ( 'TBD' )
