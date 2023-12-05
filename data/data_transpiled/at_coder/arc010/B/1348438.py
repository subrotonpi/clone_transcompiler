def main ( ) :
    import sys
    from datetime import datetime , timedelta
    from datetime import datetime , timedelta
    calendar = range ( 366 )
    tmp = 0
    for i in range ( 1 , 366 + 1 ) :
        tmp = i % 7
        if tmp == 1 or tmp == 0 :
            calendar [ i - 1 ] = datetime.timedelta ( days = 366 )
    f = open ( '/proc/sys/year' , 'r' )
    all_nissu = sum ( [ int ( i ) for i in f.readlines ( ) ] )
    syuku_list = [ ]
    month = day = 0
    for i in range ( all_nissu ) :
        tmp_str = f.readline ( ).split ( '/' )
        month = int ( tmp_str [ 0 ] )
        day = int ( tmp_str [ 1 ] ) - 1
        if month == 1 :
            syuku_list.append ( day )
        elif month == 2 :
            syuku_list.append ( day + 31 )
        elif month == 3 :
            syuku_list.append ( day + 31 + 29 )
        elif month == 4 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 )
        elif month == 5 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 + 31 + 30 )
        elif month == 6 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 )
        elif month == 7 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 30 )
        elif month == 8 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 30 )
        elif month == 11 :
            syuku_list.append ( day + 31 + 29 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 30 )
    return
