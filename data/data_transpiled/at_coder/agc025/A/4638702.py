def import import *
from StringIO import StringIO
from itertools import chain
class Main ( object ) :
    def __call__ ( self , stream , * args , ** kwargs ) :
        N = stream.read ( )
        if len ( N ) == 1 :
            stream.write ( N )
            return
        if N [ 0 : 2 ] == "10" :
            sum = 10
            if len ( N ) > 2 :
                sum += reduce ( lambda x , y : x + y , N [ 2 : ].split ( "" ) , N [ 1 : ] )
            stream.write ( sum )
        else :
            sum = reduce ( lambda x , y : x + y , N.split ( ""),N.split(""),N.split(""),N.split(""),N.split(""),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split(","),N.split("),N.split(","),N.split(","),N.split(","),N.split("),N.split(","),N.split("),N.split(","),N.split("),N.split(","),N.split("),N.split(","),N.split("),N.split(","),N.split(" )
            