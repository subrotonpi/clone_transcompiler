def import import struct
class Main ( struct ) :
    def __init__ ( self ) :
        struct.__init__ ( self )
        self.R = int ( self.R )
        self.C = int ( self.C )
        self.K = int ( self.K )
        self.N = int ( self.N )
        r = [ ]
        c = [ ]
        sum_r = [ ]
        sum_c = [ ]
        for i in range ( self.N ) :
            r.append ( self.R - 1 )
            c.append ( self.C - 1 )
            sum_r [ r [ i ] ] += 1
            sum_c [ c [ i ] ] += 1
        row = struct.unpack ( ">q" , r )
        column = struct.unpack ( ">q" , c )
        ans = 0
        for i in range ( 0 , K ) :
            ans += row [ i ] * column [ K - i ]
        for i in range ( self.N ) :
            if sum_r [ r [ i ] ] + sum_c [ c [ i ] ] == K :
                ans -= 1
            elif sum_r [ r [ i ] ] + sum_c [ c [ i ] ] == K + 1 :
                ans += 1
        print ( ans )
