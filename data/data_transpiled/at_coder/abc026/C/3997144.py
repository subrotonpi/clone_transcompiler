def import import sys , list , range , time
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( os.environ.get ( 'NUMBER' , '' ) )
        b = [ ]
        for i in range ( 1 , n ) :
            b.append ( sc.randint ( 1 , n ) )
        lst = [ ]
        for i in range ( n ) :
            subList = [ ]
            for j in range ( n ) :
                if i + 1 == b [ j ] :
                    subList.append ( j )
            lst.append ( subList )
        p = [ ]
        for i in range ( n - 1 , - 1 , - 1 ) :
            if len ( lst [ i ] ) == 0 :
                p.append ( 1 )
            else :
                min = int ( 1e9 )
                max = 0
                for j in lst [ i ] :
                    min = min ( min , p [ j ] )
                    max = max ( max , p [ j ] )
                p.append ( min + max + 1 )
        print ( p [ 0 ] )
