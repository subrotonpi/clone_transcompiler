def _ import _ file , file , read , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , ) :
    sc = readwrite
    n = read_int ( )
    if readwrite is None : raise readwrite
    if readwrite is None : raise readwrite
    read ( n )
    C = [ ]
    S = [ ]
    F = [ ]
    for i in range ( n - 1 ) :
        C.append ( readwrite ( n ) )
        S.append ( readwrite ( n ) )
        F.append ( readwrite ( n ) )
    for i in range ( n - 1 ) :
        now = S [ i ] + C [ i ]
        for j in range ( i + 1 , n - 1 ) :
            if S [ j ] > now :
                now = S [ j ] + C [ j ]
            else :
                s = now - S [ j ]
                now += ( F [ j ] - ( s % F [ j ] ) ) % F [ j ] + C [ j ]
        print ( now )
    print ( 0 )
    class readwrite :
        def __init__ ( self , f ) :
            self.f = f
            self.buffer = readwrite ( f )
        def has_eof ( self ) :
            if ptr < len ( self.buffer ) :
                return True
            else :
                ptr = 0
                try :
                    buflen = self.f.read ( ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
    readwrite ( readwrite )
