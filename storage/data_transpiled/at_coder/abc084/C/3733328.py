def main ( ) :
    import sys
    try :
        with open ( '/proc/stations' , 'r' ) as f :
            solve ( f )
    except :
        print ( 'No program found' )
        return
    n = sys.stdin.readline ( ).strip ( )
    arrival_time = [ 0 ] * n
    for i in range ( n - 1 ) :
        spent_time = time.pop ( )
        start_time = time.pop ( )
        frequent_time = time.pop ( )
        for j in range ( 0 , i ) :
            if arrival_time [ j ] < start_time :
                arrival_time [ j ] = start_time
            if arrival_time [ j ] % frequent_time != 0 :
                arrival_time [ j ] += frequent_time - ( arrival_time [ j ] % frequent_time )
            arrival_time [ j ] += spent_time
    for i in range ( n ) :
        print ( arrival_time [ i ] )
