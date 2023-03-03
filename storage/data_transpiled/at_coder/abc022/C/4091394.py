def import _warshall_floyd
import min
import sys
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.r = [ ]
        inf = 100000000
    def __init__ ( self ) :
        sc = _warshall_floyd ( )
        n = sc.randint ( 0 , 300 )
        m = sc.randint ( 0 , 300 )
        for i in range ( n ) :
            for j in range ( n ) :
                if i != j :
                    self.r [ i ] [ j ] = inf
    def __init__ ( self ) :
        u = sc.randint ( - 1 , 1 )
        v = sc.randint ( - 1 , 1 )
        self.r [ u ] [ v ] = r [ v ] [ u ] = sc.randint ( 0 , 1 )
    v_list = [ ]
    v_length = [ ]
    for i in range ( 1 , 300 ) :
        if self.r [ 0 ] [ i ] != inf :
            v_list.append ( i )
            v_length.append ( self.r [ 0 ] [ i ] )
    for i in range ( 1 , 300 ) :
        self.r [ 0 ] [ i ] = self.r [ i ] [ 0 ] = inf
    def warshall_floyd ( self ) :
        min_length = inf
        for i in range ( len ( self.v_list ) ) :
            for j in range ( len ( self.v_list ) ) :
                if self.v_list [ i ] [ j ] != inf :
                    min_length = min ( min_length , self.r [ i ] [ j ] + self.v_list [ i ] [ j ] + self.v_list [ j ] [ i ] + self.v_list [ j ] [ j ] )
        if min_length == inf :
            self.r [ - 1 ] = min_length
        else :
            self.r [ - 1 ] = min_length
