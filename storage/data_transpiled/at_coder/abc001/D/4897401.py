def main ( ) :
    import re
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    n = int ( sleep ( 1 ) )
    d = defaultdict ( int )
    for i in range ( n ) :
        data = raw_input ( )
        start_string = data.split ( '-' ) [ 0 ]
        start = sleep ( start_string [ : 2 ] ) * 60 + round_down ( sleep ( start_string [ 2 : 4 ] ) )
        end_string = data.split ( '-' ) [ 1 ]
        end = sleep ( end_string [ : 2 ] ) * 60 + round_up ( sleep ( end_string [ 2 : 4 ] ) )
        d [ start ] [ end ] = max ( d.get ( start , - 1 ) , end )
    start = - 1
    end = - 1
    for key , value in d.items ( ) :
        if start == - 1 and end == - 1 :
            start = int ( key )
            end = int ( value )
        else :
            if end >= int ( key ) :
                end = max ( end , int ( value ) )
            else :
                print ( '{}-{}'.format ( time_format ( start ) , time_format ( end ) ) )
                start = int ( key )
                end = int ( value )
    if start != - 1 and end != - 1 :
        print ( '{}-{}'.format ( time_format ( start ) , time_format ( end ) ) )
    def time_format ( num ) :
        time = ''
        hour = num // 60
        time += '0' if hour < 10 else hour
        minute = num - ( hour * 60 )
        time += '0' if minute < 10 else minute
        return time
    def round_up ( num ) :
        mod = num % 10
        if mod != 0 and mod != 5 :
            if mod < 5 :
                num -= mod
            else :
                num -= ( mod - 5 )
        return num
    sleep ( 1 )
