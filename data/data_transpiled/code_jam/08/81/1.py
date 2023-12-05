def _import ( ) : return open ( 'A-large' )
import csv
import csv
import csv
import csv
import csv
import csv
import csv
import math
import numpy
import numpy
class A :
    import csv
    import csv
    problem = 'A-large'
    def __init__ ( self , cur ) :
        self.problem = ''
        self.stdin = open ( self.problem + '.in' , 'r' )
        self.stdout = open ( self.problem + '.out' , 'w' )
        self.stdout.flush ( )
    def iread ( ) : return int ( self.read_word ( ) )
    def dread ( ) : return float ( self.read_word ( ) )
    def apply ( self , t ) :
        for i in range ( 3 ) :
            temp = [ ]
            t.transform ( self.tr1 [ i ] , temp )
            self.tr1.append ( temp )
    def find_trans ( self ) :
        a = [ ]
        a.translate ( - self.tr1 [ 0 ] [ 0 ] , - self.tr1 [ 0 ] [ 1 ] )
        a1 = [ ]
        d1 = self.tr1 [ 0 ].distance ( self.tr1 [ 1 ] )
        d2 = self.tr2 [ 0 ].distance ( self.tr2 [ 1 ] )
        a1.scale ( d2 / d1 , d2 / d1 )
        a1.concatenate ( a )
        ang1 = math.atan2 ( self.tr1 [ 1 ] [ 1 ] - self.tr1 [ 0 ] [ 1 ] , self.tr1 [ 1 ] [ 0 ] )
        ang2 = math.atan2 ( self.tr2 [ 1 ] [ 1 ] - self.tr1 [ 0 ] [ 1 ] , self.tr2 [ 0 ] [ 0 ] )
        a2 = [ ]
        a2.rotate ( ang2 - ang1 )
        a2.concatenate ( a1 )
        a3 = [ ]
        a3.translate ( self.tr2 [ 0 ] [ 0 ] , self.tr2 [ 0 ] [ 1 ] )
        a3.concatenate ( a2 )
        tres = a3
        apply ( self , a3 )
