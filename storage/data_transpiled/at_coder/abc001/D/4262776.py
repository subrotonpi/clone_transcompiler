def main ( ) :
    import math
    global time
    global start
    global end
    with open ( '/proc/time.txt' , 'r' ) as sc :
        num = sc.read ( )
        time = [ [ int ( tmp [ 0 : 4 ] ) , int ( math.floor ( time [ 0 ] / 100.0 ) * 60 + int ( math.floor ( time [ 0 ] % 100 / 5.0 ) ) * 5 ) , int ( tmp [ 5 : 9 ] ) , int ( math.floor ( time [ 1 ] / 100.0 ) * 60 + int ( math.ceil ( time [ 1 ] % 100 / 5.0 ) ) * 5 ) ] for tmp in sc.read ( ).split ( ) ]
    start = [ 0 for i in range ( 1441 ) ]
    end = [ 0 for i in range ( 1441 ) ]
    start_count = 0
    end_count = 0
    raining = False
    for i in range ( 0 , 1440 , 5 ) :
        start_count += start [ i ]
        end_count += end [ i ]
        tmp = int ( math.floor ( i / 60.0 ) * 100 + i % 60 )
        if start_count > end_count and not raining :
            print ( '%04d' % tmp , end = '-' )
            raining = True
        elif start_count == end_count and raining :
            print ( '%04d' % tmp )
            raining = False
