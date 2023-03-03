def import _main
class Vertex ( object ) :
    def __init__ ( self , d , n ) :
        self.d = d
        self.n = n
class Edge ( object ) :
    def __init__ ( self , t , c ) :
        self.t = t
        self.c = c
    def __init__ ( self , t , c ) :
        self.t = t
        self.c = c
    def my_cmp ( self , obj1 , obj2 ) :
        v1 = self.obj
        v2 = self.obj
        if v1.d > v2.d :
            return 1
        elif v1.d < v2.d :
            return - 1
        else :
            return 0
    def my_cmp ( self , obj1 , obj2 ) :
        v1 = self.obj
        v2 = self.obj
        if v1.d > v2.d :
            return - 1
        else :
            return 0
    def my_cmp ( self , obj1 , obj2 ) :
        v1 = self.obj
        v2 = self.obj
        if v1.d > v2.d :
            return - 1
        else :
            return 0
    def main ( self ) :
        sc = _main.get ( )
        N = sc.count ( )
        M = sc.count ( )
        T = sc.count ( )
        A = [ ]
        for i in range ( N ) :
            A.append ( sc.get ( i ) )
        road1 = [ ]
        road2 = [ ]
        for i in range ( N ) :
            a = sc.count ( ) - 1
            b = sc.count ( ) - 1
            c = sc.get ( i )
            road1.append ( Edge ( b , c ) )
            road2.append ( Edge ( a , c ) )
        while len ( road1 ) > 0 :
            v = self.obj
            eList = self.obj
            for i in range ( 1 , N ) :
                v = self.obj
            que1.append ( Vertex ( v , i ) )
            que2.append ( Vertex ( v , i ) )
        return 0
que1 = Queue ( )
que2.put ( road1 )
return que1
