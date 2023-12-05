def import import sys , StringIO
class C :
    def __init__ ( self , f ) :
        self.f = f
        self.f = f
    def __init__ ( self , x , y , z ) :
        self.f = f
        self.x = x
        self.y = y
        self.z = z
    def dist ( self , p , q ) :
        self.dx = p [ 0 ] - q [ 0 ]
        self.dy = p [ 1 ] - q [ 1 ]
        self.dz = p [ 2 ] - q [ 2 ]
        return self.dx * dx + self.dy * dy + self.dz * dz
    def solve ( self , arg ) :
        self.n , s = self.n , self.s
        pts = [ Point ( self.f.x , self.f.y , self.f.z ) for self in arg ]
        vel = [ Point ( self.f.y , self.f.y , self.f.z ) for self in arg ]
        return self.dx * dx + self.dy * dy + self.dz * dz
    def solve ( self ) :
        self.n , s = self.n , self.s
        self.pts = [ Point ( self.f.x , self.f.y , self.f.z ) for self in arg ]
        self.vel = [ Point ( self.f.y , self.f.z , self.f.z ) for self in arg ]
        self.MAX_DIST = 5 * 1000 * 1000
        l , r = - 1 , MAX_DIST
        while r - l > 1 :
            mid = ( l + r ) // 2
            q = [ ]
            was = [ ]
            st , en = 0 , 0
            q.append ( 0 )
            was.append ( True )
            while st != en :
                v = q [ st ]
                st += 1
                for u in range ( self.n ) :
                    if not was [ u ] and dist ( self.pts [ u ] , self.pts [ v ] ) <= mid :
                        was [ u ] = True
                        q.append ( u )
            if was [ 1 ] :
                r = mid
            else :
                l = mid
        return self.n , s