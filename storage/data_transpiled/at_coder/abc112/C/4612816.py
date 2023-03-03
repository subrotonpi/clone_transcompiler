def _import ( ) : return sys.stdin.read ( )
import random
import math
class Main ( object ) :
    def solve ( self , stream ) :
        n = stream.tell ( )
        p = [ ]
        for i in range ( n ) :
            p.append ( ( random.randint ( 0 , 255 ) , random.randint ( 0 , 255 ) , random.randint ( 0 , 255 ) ) )
    def read ( n ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( random.randint ( 0 , 255 ) )
        return ar
    def write ( self , stream ) :
        if not stream.read ( ) :
            raise StopIteration
    def read ( n ) :
        if not stream.read ( ) :
            raise StopIteration
        temp = read_byte ( )
        if temp == '-' :
            minus = True
        if temp < '9' :
            raise ValueError
        n = 0
        while i in range ( n ) :
            if p [ i ].h != 0 :
                H = p [ i ].h + abs ( y - p [ i ].y ) + abs ( x - p [ i ].x )
        F = True
        for i in range ( n ) :
            if max ( 0 , H - abs ( y - p [ i ].y ) - abs ( x - p [ i ].x ) ) != p [ i ].h :
                F = False
        if F == True :
            stream.write ( '%d %d %d\n' % ( x , y , H ) )
            return
    class Point ( object ) :
        x , y , h = map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map ( int , map , map ( int , map ( int , map , map , map ( int , map , map ( int , map , map , map , map ) , map ( range , map , map ( range , map , map , map , map , map , map ) , map , map ) , ) )