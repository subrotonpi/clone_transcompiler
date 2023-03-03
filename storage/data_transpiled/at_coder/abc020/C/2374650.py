def _import ( ) :
    import Queue
    import sys
    import string
    import string
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.h , self.w , self.t , self.sx , self.sy , self.gx , self.gy = string.split ( ' ' )
        def __init__ ( self , x , y ) :
            self.x , self.y = x , y
        def __getitem__ ( self , x ) :
            return self.x + x
        def __getitem__ ( self , y ) :
            return self.y
        def __getitem__ ( self , x ) :
            return self.x + x
        def __getitem__ ( self , y ) :
            return self.y + y
    def main ( ) :
        sc = string.split
        h = sc.get ( )
        w = sc.get ( )
        t = sc.get ( )
        dx = [ 1 , - 1 , 0 , 0 ]
        dy = [ 0 , 0 , 1 , - 1 ]
        s = [ ]
        gragh = [ ]
        for i in range ( h ) :
            temp = sc.get ( )
            for j in range ( w ) :
                s.append ( str ( temp [ j ] ) )
        for i in range ( h ) :
            for j in range ( w ) :
                gragh [ i ] [ j ] = int ( s [ i ] [ j ] )
                if s [ i ] [ j ] == 'S' :
                    gragh [ i ] [ j ] = 0
                    sx = i
                    sy = j
                elif s [ i ] [ j ] == 'G' :
                    gx = i
                    gy = j
        l = 0
        r = t
        while r - l > 1 :
            mid = ( l + r ) // 2
            if bfs ( mid ) <= t :
                l = mid
            else :
                r = mid
        print ( l )
    def bfs ( mid ) :
        for i in range ( h ) :
            for j in range ( w ) :
                gragh [ i ] [ j ] = int ( s [ i ] [ j ] )
                if s [ i ] == '