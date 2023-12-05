def main ( ) :
    import sys
    from time import strftime
    with open ( '/proc/date' ) as sc :
        date = sc.readline ( )
        info = date.split ( '/' )
        year , month = [ int ( i ) for i in info [ 0 ].split ( '-' ) ]
        if year < 2019 or year == 2019 and month < 5 :
            print ( 'Heisei' )
        else :
            print ( 'TBD' )
