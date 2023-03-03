def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.deg = sys.maxint * 10
        self.deg /= 1125
        outdeg = None
        degs = [ 'N' , 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' , 'N' ]
        self.deg += 1
        outdeg = degs [ self.deg / 2 ]
        diss = [ 0.3 , 1.6 , 3.4 , 5.5 , 8.0 , 10.8 , 13.9 , 17.2 , 20.8 , 24.5 , 28.5 , 32.7 ]
        for d in diss :
            d = round ( d * 60 , 2 )
        outdis = 0
        dis = sys.stdin.readline ( )
        for d in diss :
            if d - 3 <= dis :
                outdis += 1
        print ( ( outdis , 'C' ) , end = ' ' )
        print ( outdis , end = ' ' )
