def import time
class Main ( object ) :
    def __init__ ( self ) :
        self.time = time
    def __str__ ( self ) :
        return self.time
    time = time.strftime ( "%Y%m%d" )
    n = str ( time )
    n = n.split ( "" )
    s = n [ 0 ]
    for i in range ( 1 , len ( n ) ) :
        n [ i ] = n [ 0 ]
        s += n [ i ]
    x = int ( s )
    if x >= time :
        print ( x )
    else :
        a = int ( n [ 0 ] ) + 1
        for i in range ( len ( n ) ) :
            print ( a , end = ' ' )
