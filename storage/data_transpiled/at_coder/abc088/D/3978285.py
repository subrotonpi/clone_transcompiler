def import _main
class Main ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
    def __str__ ( self ) :
        return '(x = %d,y = %d)' % ( self.x , self.y )
    INF = 1000000000
    def main ( self ) :
        sc = _main ( self )
        h , w = sc.split ( ' ' )
        data = [ s for s in sc.split ( ' ' ) ]
        cnt = 0
        for i in range ( h ) :
            for j in range ( w ) :
                if data [ i ] [ j ] == '#' :
                    cnt += 1
        s = Point ( 0 , 0 )
        dist = _bfs ( s , data )
        if dist [ w - 1 ] [ h - 1 ] == INF :
            print ( - 1 )
            return
        ans = h * w - ( dist [ w - 1 ] [ h - 1 ] + 1 ) - cnt
        print ( ans )
    def bfs ( self , s , data ) :
        dist = [ [ INF ] * 51 for d in dist ]
        que = Queue ( )
        que.put ( s )
        dist [ s.x ] [ s.y ] = 0
        while not que.empty ( ) :
            p = que.get ( )
            for i in range ( 4 ) :
                ny = p.y + dy [ i ]
                nx = p.x + dx [ i ]
                if nx < 0 or ny < 0 or nx >= len ( data [ 0 ] ) or ny >= len ( data ) :
                    continue
                if data [ ny ] [ nx ] == '.' and dist [ p.x ] [ p.y ] + 1 < dist [ nx ] [ ny ] :
                    dist [ nx ] [ ny ] = dist [ p.x ] [ p.y ] + 1
        return dist
class Point ( object ) :
    def __init__ ( self , x , y ) :
        self.x = x
        self.y = y
    def __str__ ( self ) :
        return '(x = %d,y = %d)' % (