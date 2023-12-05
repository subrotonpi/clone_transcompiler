def __main__ ( ) :
    from io import BufferedReader
    from os import getenv
    bf = BufferedReader ( getenv ( "PATH" ) )
    N = int ( bf.readline ( ) )
    data = bf.read ( ).split ( )
    h = [ int ( i ) for i in data [ N : ] ]
    print ( count ( h ) )
    def min ( data ) :
        min = data [ 0 ]
        for value in data [ 1 : ] :
            if value < min :
                min = value
        return min
    def count ( data ) :
        min = min ( data )
        for value in data [ 1 : ] :
            data [ i ] = value - min
        zero = True
        a = [ ]
        for value in data :
            if zero and value :
                a.append ( [ ] )
                a [ - 1 ].append ( value )
                zero = False
            elif not zero :
                if value :
                    a [ - 1 ].append ( value )
                else :
                    zero = True
        answer = min
        for i in a :
            answer += count ( i )
        return answer
    return 0
