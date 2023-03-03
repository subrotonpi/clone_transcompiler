def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( '/' )
        dict = defaultdict ( int )
        time_table = [ 0 ] * 24 * 60 + [ 2 ]
        for x in sc.split ( ) :
            start_string = x.split ( '-' ) [ 0 ]
            start = int ( start_string [ : 2 ] ) * 60 + _round_down ( int ( start_string [ 2 : 4 ] ) )
            end_string = x.split ( '-' ) [ 1 ]
            end = int ( end_string [ : 2 ] ) * 60 + _round_up ( int ( end_string [ 2 : 4 ] ) )
            time_table [ start ] += 1
            time_table [ end + 1 ] += - 1
        for i in range ( 1 , 24 * 60 + 1 ) :
            time_table [ i ] += time_table [ i - 1 ]
        for i in range ( 0 , 24 * 60 + 1 ) :
            if time_table [ i ] >= 1 :
                s = i
                while i <= 24 * 60 and time_table [ i ] >= 1 :
                    i += 1
                print ( '{}-{}'.format ( time_format ( s ) , time_format ( i - 1 ) ) )
    def time_format ( num ) :
        time = ''
        hour = num // 60
        time += '0' + hour if hour < 10 else hour
        minute = num - ( hour * 60 )
        time += '0' + minute if minute < 10 else minute
        return time
    def round_down ( num ) :
        mod = num % 10
        if mod != 0 and mod != 5 :
            if mod < 5 :
                num -= mod
            else :
                num -= ( mod - 5 )
        return num
    def round_up ( num ) :
        mod = num % 10
        if mod != 0 and mod != 5 :
            if mod > 5 :
                num += ( 10 - mod )
            else :
                num += ( 5 - mod )
        return num
