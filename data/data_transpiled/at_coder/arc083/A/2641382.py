def import import _sys , get_D , get_D , water , sugar
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.main = Main ( )
    def run ( self ) :
        with open ( self.argv [ 1 ] ) as f :
            A , B , C , D , E , F = [ int ( i ) for i in range ( 0 , F / ( 100 * A ) ) ]
            water = set ( )
            for i in range ( 0 , F / ( 100 * A ) ) :
                for j in range ( 0 , F / ( 100 * B ) ) :
                    buf = 100 * A * i + 100 * B * j
                    if buf <= F :
                        water.add ( buf )
            sugar = set ( )
            for i in range ( 0 , F / C ) :
                for j in range ( 0 , F / D ) :
                    buf = C * i + D * j
                    if buf <= F :
                        sugar.add ( buf )
    max = - 999
    den = None
    denE = get_D ( 100 , E )
    satoumizu = None
    satou = None
    for w in water :
        for s in sugar :
            if w + s <= F :
                den = get_D ( w , s )
                if den is not None and den <= denE :
                    if max < den :
                        max = den
                        satoumizu = w + s
                        satou = s
    print ( satoumizu , satou )
    def getD ( water , sugar ) :
        den = - 1
        if water is not None :
            den = float ( 100 * sugar )
            den /= float ( water + sugar )
        return den
