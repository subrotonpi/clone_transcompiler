def _import ( ) :
    import sys
    class b :
        def __init__ ( self ) :
            self.f = open ( '/dev/tty' )
            self.f.readline ( )
        def get_int ( self ) :
            return int ( self.f.readline ( ) )
        def get_ins ( self ) :
            s = self.f.readline ( ).split ( )
            for i in range ( len ( s ) ) :
                r = [ int ( s [ i ] ) for s in s ]
            return r
        def docase ( self ) :
            f = get_ins ( )
            w = f [ 0 ]
            h = f [ 1 ]
            v1 = get_ins ( )
            v2 = get_ins ( )
            v1x = v1 [ 0 ]
            v2x = v2 [ 0 ]
            v1y = v1 [ 1 ]
            v2y = v2 [ 1 ]
            start = get_ins ( )
            startx = start [ 0 ]
            starty = start [ 1 ]
            r = 0
            if startx < 0 or startx >= w or starty < 0 or starty >= h :
                return 0
            if v1x * v2y == v1y * v2x :
                if v1x == 0 :
                    t = w
                    w = h
                    h = t
                else :
                    t = v1x
            else :
                t = v1y
            if v2x == 0 :
                t = v1x
            else :
                t = v1x
            if v1y == 0 :
                t = v1y
            else :
                t = v2x
        seen = { }
        q = [ startx , starty ]
        r = 1
        while qg < qp :
            atx = q [ qg ]
            aty = q [ qg ]
            if atx + v1x >= 0 and atx + v1x < w and not seen [ atx + v1x ] and aty + v1y >= 0 and aty + v1y < h :
                q [ atx + v1x ] = True
                r += 1
        return r
    return b
