def import _main
class Main ( object ) :
    INF = float ( 'inf' )
    class Circle ( object ) :
        def __init__ ( self , x , y , r ) :
            self.x , self.y , self.r = x , y , r
            self.min_cost = INF
            self.visit = False
            self.child = [ ]
        def __init__ ( self , x , y , r ) :
            self.x , self.y , self.r = x , y , r
            self.visit = False
        def __init__ ( self , src , dst , cost ) :
            self.src , self.dst = src , dst
            self.cost = cost
    def main ( sc ) :
        s = Circle ( sc.x , sc.y , 0 )
        t = Circle ( sc.x , sc.y , 0 )
        n = sc.count ( )
        c = [ s ]
        for i in range ( 1 , n + 1 ) :
            c.append ( Circle ( sc.x , sc.y , sc.cost ) )
        c.append ( t )
        sc.close ( )
        for i in range ( n + 2 ) :
            for j in range ( i + 1 , n + 2 ) :
                len = _getLength ( c [ i ] , c [ j ] )
                c [ i ].child.append ( Road ( i , j , len ) )
                c [ j ].child.append ( Road ( j , i , len ) )
        c [ 0 ].min_cost = 0.0
        queue = Queue ( ( o1 , o2 ) )
        queue.put ( c [ 0 ] )
        while not queue.empty ( ) :
            tmp = queue.get ( )
            if tmp.visit :
                continue
            tmp.visit = True
            for r in tmp.child :
                if c [ r.dst ].visit :
                    continue
                c [ r.dst ].min_cost = min ( c [ r.dst ].min_cost , tmp.min_cost + r.cost )
                queue.put ( c [ r.dst ] )
        print ( '%.10f' % ( c [ n + 1 ].min_cost ) )
