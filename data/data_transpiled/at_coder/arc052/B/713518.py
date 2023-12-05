def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.f = open ( "/dev/null" , "r" )
            self.N = self.N
            self.Q = self.Q
            self.x = [ ]
            self.r = [ ]
            self.h = [ ]
            self.A = [ ]
            self.B = [ ]
            for dummy in self.f :
                self.x.append ( self.x [ 0 ] )
                self.r.append ( self.r [ 0 ] )
                self.h.append ( self.h [ 0 ] )
            for dummy in self.f :
                self.A.append ( self.x [ 0 ] )
                self.B.append ( self.x [ 1 ] )
    v = [ ]
    htmp = [ ]
    vtmp = [ ]
    output = [ ]
    for i in range ( N ) :
        v.append ( math.pi * self.h [ i ] * self.r [ i ] ** 2 / 3 )
    for j in range ( Q ) :
        for i in range ( N ) :
            vtmp.append ( v [ i ] )
        for i in range ( N ) :
            if x [ i ] > B [ j ] :
                vtmp.append ( 0 )
            elif x [ i ] < A [ j ] :
                htmp.append ( h [ i ] - A [ j ] + x [ i ] )
                if x [ i ] + h [ i ] < A [ j ] :
                    vtmp.append ( 0 )
                else :
                    vtmp.append ( v [ i ] * math.pow ( htmp [ i ] / h [ i ] , 3 ) )
                    if x [ i ] + h [ i ] > B [ j ] :
                        htmp.append ( h [ i ] - B [ j ] + x [ i ] )
                        vtmp.append ( vtmp [ i ] - ( v [ i ] * math.pow ( htmp [ i ] / h [ i ] , 3 ) ) )
return Main ( )
