def import _pack2
import struct
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 0
        self.w = [ ]
        self.left = { }
        self.right = { }
    def __init__ ( self , * args ) :
        sc = struct.Struct ( "<i" )
        N , X = sc.unpack ( )
        self.w = [ ]
        for i in range ( N ) :
            self.w.append ( sc.unpack ( ) )
        self.a = N // 2
        ans = 0
        pack ( 0 , a , self.left , 0 )
        pack ( a , N , self.right , 0 )
        for c in self.left :
            if self.right.has_key ( X - c ) :
                ans += self.left [ c ] * self.right [ X - c ]
        print ( ans )
    def pack ( self , s , g , d , W ) :
        if s == g :
            if W in d :
                d [ W ] = d [ W ] + 1
            else :
                d [ W ] = 1
        else :
            pack ( self , s + 1 , g , d , W )
            pack ( self , s + 1 , g , d , W + w [ s ] )
