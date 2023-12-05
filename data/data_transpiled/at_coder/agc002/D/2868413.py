def _import ( ) : return sys.stdout.write
import os
class Main ( object ) :
    def __init__ ( self , v , t ) :
        self.update = { }
        self.pare = { }
        self.sizes = defaultdict ( lambda : [ ] )
        def root ( v , t ) :
            if self.update [ v ] > t :
                return v
            return root ( self.pare [ v ] , t )
        def size ( v , t ) :
            v = root ( v , t )
            return self.sizes [ v ].floorentry ( t ) [ 1 ]
        def unite ( v , u , t ) :
            v = root ( v , t )
            u = root ( u , t )
            if v == u :
                return v
            if self.pare [ u ] < self.pare [ v ] :
                tmp = u
                u = v
                v = tmp
            self.pare [ v ] += self.pare [ u ]
            self.sizes [ v ] [ t ] = - self.pare [ v ]
            self.pare [ u ] = v
            self.update [ u ] = t
    def main ( ) :
        with open ( '/proc/' , 'r' ) as f :
            N , M = struct.unpack ( '>I' , f.read ( ) )
            self.pare = { }
            self.update = { }
            self.sizes = defaultdict ( lambda : [ ] )
            for i in range ( N ) :
                self.sizes [ i ] = defaultdict ( int )
                self.sizes [ i ] [ 0 ] += 1
            self.pare [ v ] = - 1
            self.update [ v ] = int ( self.update [ v ] )
            for i in range ( 1 , M ) :
                self.unite ( int ( f.read ( ) ) - 1 , int ( f.read ( ) ) - 1 , i )
    Q = sys.maxsize
    out = open ( '/proc/' , 'w' )
    while Q :
        x , y , z = struct.unpack ( '>I' , f.read ( ) )
        left , right = 0 , M
        while right - left > 1 :
            t = ( left