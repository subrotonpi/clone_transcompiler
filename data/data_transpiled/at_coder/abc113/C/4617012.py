def import _import_city
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = sys.stdin.read ( ).split ( '\n' )
    def __init__ ( self ) :
        self.n , self.m = n , m
        cities = [ ]
        from collections import deque
        a = deque ( )
        for i , p in enumerate ( cities ) :
            if not isinstance ( p , list ) :
                a.append ( ( p , p ) )
            if not isinstance ( p , list ) :
                p = p [ 0 ]
            a.append ( p )
        for city_set in a :
            if city_set :
                i = 0
                for city in city_set :
                    city.o = i
                    i += 1
        for city in cities :
            print ( "%06d%06d" % ( city.p , city.o ) )
    class City ( object ) :
        def __init__ ( self , p , y ) :
            self.p , self.y , self.o = p , y
